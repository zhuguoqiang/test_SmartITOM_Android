package com.example.testsmartitomandroid.ui;

import com.example.testsmartitomandroid.R;
import com.example.testsmartitomandroid.R.layout;
import com.example.testsmartitomandroid.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;

public class Main extends TabActivity {
	public final static String TAG = "MainActivity";
	public static int currentActivity = 1;
	private TabHost mainHost;
	private ImageView headLogoIV;
	private TextView headTitleTV;
	private Button headMoreButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		headLogoIV = (ImageView)findViewById(R.id.main_head_logo);
		headTitleTV = (TextView)findViewById(R.id.main_head_title);
		mainHost = getTabHost();
		mainHost.setup();  // 初始tabHost 供系统tabHost 找到 tabs   和 tabcontent
			
		TabSpec nav = mainHost.newTabSpec("nav");  //创建 tab 页  
		nav.setIndicator(getIndicatorView(R.drawable.widget_index_myatte,R.string.nav_function));
//		nav.setIndicator("导航功能", getResources().getDrawable(R.drawable.widget_index_nav));   //创建默认样式的indicator （提示标题）
		nav.setContent(new Intent(this, Nav.class));
		mainHost.addTab(nav);
		
		TabSpec myatte = mainHost.newTabSpec("myatte");  //创建 tab 页  
		myatte.setIndicator(getIndicatorView(R.drawable.widget_index_nav,R.string.my_attetion));
		myatte.setContent(new Intent(this, MyAttetion.class));
		mainHost.addTab(myatte);
		
		TabSpec toolsbox = mainHost.newTabSpec("toolsbox");  //创建 tab 页  
		toolsbox.setIndicator(getIndicatorView(R.drawable.widget_index_toolsbox,R.string.tools_box));
		toolsbox.setContent(new Intent(this, ToolsBox.class));
		mainHost.addTab(toolsbox);
		
		TabSpec setting = mainHost.newTabSpec("setting");  //创建 tab 页  
		setting.setIndicator(getIndicatorView(R.drawable.widget_index_setting,R.string.setting));
		setting.setContent(new Intent(this, Setting.class));
		mainHost.addTab(setting);

		mainHost.setCurrentTab(0);
		mainHost.setOnTabChangedListener(new TabChangeListener());

	}

	private View getIndicatorView(int Did, int Tid) {
		View view = getLayoutInflater().inflate(R.layout.indicator_view, null);
		ImageView imgView = (ImageView)view.findViewById(R.id.widget_icon);  
		imgView.setImageResource(Did);
		TextView textView = (TextView)view.findViewById(R.id.widget_label);
		textView.setText(Tid);
		return view;
	}
	
	private final class TabChangeListener implements OnTabChangeListener{

		@Override
		public void onTabChanged(String tabId) {
				if("nav".equals(tabId)){
					headLogoIV.setImageResource(R.drawable.widget_index_myatte);
					headTitleTV.setText(R.string.nav_function);
					currentActivity = 1;
				}
				if("myatte".equals(tabId)){
					headLogoIV.setImageResource(R.drawable.widget_index_nav);
					headTitleTV.setText(R.string.my_attetion);
					currentActivity = 2;
				}
				if("toolsbox".equals(tabId)){
					headLogoIV.setImageResource(R.drawable.widget_index_toolsbox);
					headTitleTV.setText(R.string.tools_box);
					currentActivity = 3;
				}
				if("setting".equals(tabId)){
					headLogoIV.setImageResource(R.drawable.widget_index_setting);
					headTitleTV.setText(R.string.setting);
					currentActivity = 4;
				}
		}
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
