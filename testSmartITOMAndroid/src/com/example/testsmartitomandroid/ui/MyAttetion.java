package com.example.testsmartitomandroid.ui;

import com.example.testsmartitomandroid.R;
import com.example.testsmartitomandroid.R.layout;
import com.example.testsmartitomandroid.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MyAttetion extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_attetion);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_attetion, menu);
		return true;
	}

}
