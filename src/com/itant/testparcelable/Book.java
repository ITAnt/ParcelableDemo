package com.itant.testparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Book implements Parcelable {

	private int bookPage;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bookPage) {
		this.bookPage = bookPage;
	}

	public int getBookPage() {
		return bookPage;
	}

	public void setBookPage(int bookPage) {
		this.bookPage = bookPage;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		dest.writeInt(bookPage);
	}
	
	public static final Creator<Book> CREATOR = new Creator<Book>() {

		@Override
		public Book createFromParcel(Parcel source) {
			// TODO Auto-generated method stub
			return new Book(source);
		}

		@Override
		public Book[] newArray(int size) {
			// TODO Auto-generated method stub
			return new Book[size];
		}
	};
	
	private Book(Parcel source) {
		bookPage = source.readInt();
	}
}
