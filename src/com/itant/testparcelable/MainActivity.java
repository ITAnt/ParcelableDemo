package com.itant.testparcelable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button btn_jump;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn_jump = (Button) findViewById(R.id.btn_jump);
		btn_jump.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				User user = new User(25, "jason", true, 11, new Book(555));
				Intent intent = new Intent(MainActivity.this, SecondActivity.class);
				Bundle bundle = new Bundle();
				bundle.putParcelable("user", user);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
	}
}
