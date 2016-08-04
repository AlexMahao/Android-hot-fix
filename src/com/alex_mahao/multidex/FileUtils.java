package com.alex_mahao.multidex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtils {

	
	/**
	 *  复制文件
	 * @param sourceFile
	 * @param targetFile
	 * @throws IOException
	 */
	 
	public static void copyFile(String sourceFile, String targetFile) throws IOException {

		InputStream is = new FileInputStream(sourceFile);

		File outFile = new File(targetFile);
		
		if(outFile.exists()){
			outFile.delete();
		}
		
		OutputStream os = new FileOutputStream(targetFile);

		int len = 0;

		byte[] buffer = new byte[1024];

		while ((len = is.read(buffer)) != -1) {
			os.write(buffer, 0, len);
		}

		os.close();
		is.close();

	}
}
