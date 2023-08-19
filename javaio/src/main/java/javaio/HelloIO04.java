package javaio;

import java.io.FileReader;
import java.io.Reader;

public class HelloIO04 {

	public static void main(String[] args) throws Exception {
		Reader in = new FileReader("/tmp/hello.txt");
//		int ch1 = in.read();
//		int ch2 = in.read();
//		int ch3= in.read();
//		int ch4= in.read();
//		
//		System.out.println((char)ch1);
//		System.out.println((char)ch2);
//		System.out.println((char)ch3);
//		System.out.println(ch4);
//		
		int ch = -1;
		while((ch = in.read())!= -1) {
			System.out.println((char)ch);
		}
		in.close();
		
	}

}
