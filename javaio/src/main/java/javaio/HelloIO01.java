package javaio;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class HelloIO01 {

	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("/tmp/helloio.dat");
		out.write(1);
		out.write(255);
		out.write(0);
		
		out.close();
		
	}

}
