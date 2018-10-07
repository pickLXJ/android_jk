package com.example.forceapkobj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_pay_load);
		
		int iii = 100;
		
		Log.i("demo1", "i = "+iii);
		
		TextView tv = (TextView) findViewById(R.id.tv);
		
		Log.i("demo1", "2");
		
		Toast.makeText(this,"测试一下添加代码!\n",Toast.LENGTH_SHORT).show();
		
		
		tv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(MainActivity.this,SubActivity.class);
				startActivity(intent);
			}
		});
		
	}

}
