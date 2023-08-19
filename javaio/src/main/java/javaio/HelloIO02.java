package javaio;

import java.io.FileInputStream;
import java.io.InputStream;

public class HelloIO02 {

	public static void main(String[] args) throws Exception{
		InputStream in = new FileInputStream("/tmp/helloio.dat");
//		int i1 = in.read();
//		System.out.println(i1);
//		int i2 = in.read();
		
		int buf = -1;
		while( (buf = in.read()) != -1) {
			 System.out.println(buf);
		}
		 
	}

}
