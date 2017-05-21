package com.itant.testparcelable;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

	private TextView tv_show;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		User user = getIntent().getExtras().getParcelable("user");
		tv_show = (TextView) findViewById(R.id.tv_show);
		tv_show.setText(user.getName().concat("==")
				.concat(String.valueOf(user.getAge())).concat("==")
				.concat(String.valueOf(user.isMale())).concat("==")
				.concat(String.valueOf(user.getFriends())).concat("==")
				.concat(String.valueOf(user.getBook().getBookPage())));
	}
}
