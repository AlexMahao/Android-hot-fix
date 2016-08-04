package com.alex_mahao.multidex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import hot.Test;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void inject(View view) {

		// 无bug的classes2.dex文件存放地址
		String sourceFile = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator
				+ "classes2.dex";

		// 系统的私有目录
		String targetFile = this.getDir("odex", Context.MODE_PRIVATE).getAbsolutePath() + File.separator
				+ "classes2.dex";

		try {
			// 复制文件到私有目录
			FileUtils.copyFile(sourceFile, targetFile);
			
			// 加载.dex文件
			FixDexUtils.loadFixDex(this.getApplication());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		

	}

	public void test(View view) {
		Test.show(this);

	}
}
