package com.example.testsmartitomandroid.ui;

import java.util.ArrayList;
import java.util.HashMap;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.testsmartitomandroid.R;

public class Nav extends Activity {
	private int[] iconArray = new int[]{
			R.drawable.th_1,
			R.drawable.th_2,
			R.drawable.th_3,
			R.drawable.th_4,
			R.drawable.th_5,
			R.drawable.th_6,
			R.drawable.th_7,
			R.drawable.th_8};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nav);
		
	    GridView gridview = (GridView) findViewById(R.id.gridview);         
      //生成动态数组，并且转入数据  
        ArrayList<HashMap<String, Object>> lstImageItem = new ArrayList<HashMap<String, Object>>();  

        HashMap<String, Object> map = new HashMap<String, Object>();  
        map.put("ItemImage", iconArray[0]);//添加图像资源的ID  
        map.put("ItemText", getResources().getString(R.string.message_manage));//按序号做ItemText  
        lstImageItem.add(map);  
        
        map = new HashMap<String, Object>();  
        map.put("ItemImage", iconArray[1]);//添加图像资源的ID  
        map.put("ItemText", getResources().getString(R.string.driver_info));//按序号做ItemText  
        lstImageItem.add(map); 
        
        map = new HashMap<String, Object>();  
        map.put("ItemImage", iconArray[2]);//添加图像资源的ID  
        map.put("ItemText", getResources().getString(R.string.alert_deal));//按序号做ItemText  
        lstImageItem.add(map); 
        
        map = new HashMap<String, Object>();  
        map.put("ItemImage", iconArray[3]);//添加图像资源的ID  
        map.put("ItemText", getResources().getString(R.string.link_manage));//按序号做ItemText  
        lstImageItem.add(map); 
        
        map = new HashMap<String, Object>();  
        map.put("ItemImage", iconArray[4]);//添加图像资源的ID  
        map.put("ItemText", getResources().getString(R.string.TDC_scan));//按序号做ItemText  
        lstImageItem.add(map); 
        
        map = new HashMap<String, Object>();  
        map.put("ItemImage", iconArray[5]);//添加图像资源的ID  
        map.put("ItemText", getResources().getString(R.string.order_deal));//按序号做ItemText  
        lstImageItem.add(map); 
        
        map = new HashMap<String, Object>();  
        map.put("ItemImage", iconArray[6]);//添加图像资源的ID  
        map.put("ItemText", getResources().getString(R.string.link_manage));//按序号做ItemText  
        lstImageItem.add(map); 
        
        map = new HashMap<String, Object>();  
        map.put("ItemImage", iconArray[7]);//添加图像资源的ID  
        map.put("ItemText", getResources().getString(R.string.TDC_scan));//按序号做ItemText  
        lstImageItem.add(map); 
        
        
        //生成适配器的ImageItem <====> 动态数组的元素，两者一一对应  
        SimpleAdapter saImageItems = new SimpleAdapter(this,lstImageItem,R.layout.night_item,     
             new String[] {"ItemImage","ItemText"},new int[] {R.id.ItemImage,R.id.ItemText});  
	    gridview.setAdapter(saImageItems);  
	      //添加消息处理  
	    gridview.setOnItemClickListener(new ItemClickListener()); 
	  }  
	    
	//当AdapterView被单击(触摸屏或者键盘)，则返回的Item单击事件  
	  class  ItemClickListener implements OnItemClickListener  
	  {  
		  
		  @SuppressLint("NewApi")
		  public void onItemClick(AdapterView<?> arg0,View arg1,int arg2,long arg3 ) {  
			  
		    //在本例arg2=arg3  
		    HashMap<String, Object> item=(HashMap<String, Object>) arg0.getItemAtPosition(arg2);  
		    String itemName = (String)item.get("ItemText");
		    int imgId = (Integer)item.get("ItemImage");
	    	ImageView img = (ImageView) arg1.findViewById(R.id.ItemImage);
	    	Animation aa = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.item_click);
	    	img.startAnimation(aa);
	    	switch((Integer)item.get("ItemImage")){
	    	case R.drawable.th_1:
	    		Toast.makeText(getApplicationContext(),getResources().getString(R.string.message_manage), Toast.LENGTH_SHORT).show();
	    		break;
	    	case R.drawable.th_2:
	    		Toast.makeText(getApplicationContext(),getResources().getString(R.string.driver_info), Toast.LENGTH_SHORT).show();
	    		break;
	    	case R.drawable.th_3:
	    		Toast.makeText(getApplicationContext(),getResources().getString(R.string.alert_deal), Toast.LENGTH_SHORT).show();
	    		break;
	    	case R.drawable.th_4:
	    		Toast.makeText(getApplicationContext(),getResources().getString(R.string.link_manage), Toast.LENGTH_SHORT).show();
	    		break;
	    	case R.drawable.th_5:
	    		Toast.makeText(getApplicationContext(),getResources().getString(R.string.TDC_scan), Toast.LENGTH_SHORT).show();
	    		break;
	    	case R.drawable.th_6:
	    		Toast.makeText(getApplicationContext(),getResources().getString(R.string.order_deal), Toast.LENGTH_SHORT).show();
	    		break;
	    	case R.drawable.th_7:
	    		Toast.makeText(getApplicationContext(),getResources().getString(R.string.link_manage), Toast.LENGTH_SHORT).show();
	    		break;
	    	case R.drawable.th_8:
	    		Toast.makeText(getApplicationContext(),getResources().getString(R.string.TDC_scan), Toast.LENGTH_SHORT).show();
	    		break;
	    	default:
	    		Toast.makeText(getApplicationContext(),getResources().getString(R.string.message_manage), Toast.LENGTH_SHORT).show();
	    		break;
	    	}
		    
	}  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.nav, menu);
		return true;
	}

}
