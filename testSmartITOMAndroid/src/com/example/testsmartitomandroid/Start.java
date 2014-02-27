package com.example.testsmartitomandroid;

import com.example.testsmartitomandroid.ui.Login;
import com.example.testsmartitomandroid.ui.Main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public class Start extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		View start = getLayoutInflater().inflate(R.layout.start, null);
		setContentView(start);
		Animation aa = new AlphaAnimation(0.0f,1.0f);
		aa.setDuration(1000);
		aa.setAnimationListener(new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
				
			}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				redirectTo();
			}
		});
		start.startAnimation(aa);
	}
	
	private void redirectTo(){
		Intent main = new Intent(getApplicationContext(),Login.class);
		startActivity(main);
		overridePendingTransition(R.anim.activity_change_default,R.anim.activity_change_default);
		Start.this.finish();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
