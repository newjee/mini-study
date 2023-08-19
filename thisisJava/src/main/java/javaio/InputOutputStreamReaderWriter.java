package javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class InputOutputStreamReaderWriter {

	public static void main(String[] args) throws Exception{
		write("문자 변환 스트림 사용");
		
		String data = read1();
		System.out.println(data);
	}


	private static void write(String string) throws Exception {
		OutputStream os = new FileOutputStream("/tmp/test.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		writer.write(string);
		writer.flush();
		writer.close();
		
	}
	
	public static String read1() throws Exception{
//		InputStream is = new FileInputStream("/tmp/test.txt");
//		Reader reader = new InputStreamReader(is);
//		InputStream is2 = new InputStream(fi); xxxxxxxxxx
		
		Reader reader = new InputStreamReader(new FileInputStream("/tmp/test.txt"));
		
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		
		String str = new String(data,0,num);
		return str;
	}

	private static String read() {
		return null;
	}
}
