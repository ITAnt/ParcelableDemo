package com.itant.testparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

	private int age;
	private String name;
	private boolean isMale;
	private int friends;
	
	private Book book;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(int age, String name, boolean isMale, int friends, Book book) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
		this.isMale = isMale;
		this.friends = friends;
		this.book = book;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	public int getFriends() {
		return friends;
	}

	public void setFriends(int friends) {
		this.friends = friends;
	}
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		dest.writeInt(age);
		dest.writeString(name);
		dest.writeInt(isMale ? 1 : 0);
		dest.writeInt(friends);
		dest.writeParcelable(book, flags);
	}
	
	public static final Parcelable.Creator<User> CREATOR = new Creator<User>() {
		
		@Override
		public User[] newArray(int size) {
			// TODO Auto-generated method stub
			return new User[size];
		}
		
		@Override
		public User createFromParcel(Parcel source) {
			// TODO Auto-generated method stub
			return new User(source);
		}
	};
	
	private User(Parcel source) {
		age = source.readInt();
		name = source.readString();
		isMale = source.readInt() == 1;
		friends = source.readInt();
		book = source.readParcelable(Thread.currentThread().getContextClassLoader());
	}
}
