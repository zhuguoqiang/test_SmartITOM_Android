package com.example.testsmartitomandroid.ui;

import com.example.testsmartitomandroid.R;
import com.example.testsmartitomandroid.R.layout;
import com.example.testsmartitomandroid.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ToolsBox extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tools_box);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tools_box, menu);
		return true;
	}

}
