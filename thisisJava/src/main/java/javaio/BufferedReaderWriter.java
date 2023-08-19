package javaio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedReaderWriter {

	public static void main(String[] args) throws Exception {
		String originFilePath1 = BufferedReaderWriter.class.getResource("/Users/nabi/Downloads/dora.png").getPath();
		String targetFilePath1 = "/tmp/targetFile.png";
		FileInputStream fis = new FileInputStream(originFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		 
		//입출력 스트림 + 버퍼 스트림 생성
		String originFilePath2 = BufferedReaderWriter.class.getResource("/tmp/targetFile2.png").getPath();
		String targetFilePath2 = "/Users/nabi/Downloads/dora2.png";
		
		//*************************************************************8//
		FileInputStream fis2 = new FileInputStream(originFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		
		//버퍼 x 
		long nonBufTime = copy(fis,fos);
		System.out.println(nonBufTime);
		
		//버퍼
		long bufTime = copy(fis2, fos2);
		System.out.println(bufTime);
}

	private static long copy(InputStream is, OutputStream os) throws Exception {
		
		long start = System.nanoTime();
		
		while(true) {
			int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		
		long end = System.nanoTime();
		return (end - start);
		
		
	}
}