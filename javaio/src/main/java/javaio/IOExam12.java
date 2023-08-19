package javaio;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IOExam12 {

	public static void main(String[] args) throws Exception{
		DataInputStream in = new DataInputStream(new FileInputStream("/tmp/score.dat"));
		
		printStudent(in);
		printStudent(in);
	
		in.close();
		
	}

	private static void printStudent(DataInputStream in) throws IOException {
		String name = in.readUTF();
		int kor = in.readInt();
		int eng = in.readInt();
		int math = in.readInt();
		double total = in.readDouble();
		double avg = in.readDouble();
		
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(total);
	}

}
