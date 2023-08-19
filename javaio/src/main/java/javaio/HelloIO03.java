package javaio;

import java.io.FileWriter;
import java.io.Writer;

//writer
public class HelloIO03 {

	public static void main(String[] args) throws Exception{
		Writer out = new FileWriter("/tmp/hello.txt");
		out.write((int)'가');
		out.write((int)'나');
		out.write((int)'다');
		out.close();
		
	}

}
