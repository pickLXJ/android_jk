package com.example.forceapkobj;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application{
	
	@Override
	public void onCreate() {
		super.onCreate();
		Log.i("demo3", "long source apk onCreate:"+this);
	}

}
