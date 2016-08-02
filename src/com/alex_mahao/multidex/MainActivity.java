package com.alex_mahao.multidex;

import java.io.File;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import hot.Test;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	
	public void inject(View view){
		  //  获取odex 目录
		  File filesDir = this.getDir("odex", Context.MODE_PRIVATE);
		 
		  String outFile = filesDir.getAbsoluteFile()+File.separator+"classes2.dex";
		  
		  
		  
		  
	}

	public void test(View view){
		Test.show(this);
	
	}
}
