package com.alex_mahao.multidex;

import android.app.Application;
import android.content.Context;

public class MyApp extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
	}
	
	@Override
	protected void attachBaseContext(Context base) {
		super.attachBaseContext(base);
		FixDexUtils.loadFixDex(base);
	}

}
