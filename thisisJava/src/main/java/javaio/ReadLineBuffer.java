package javaio;
// buffer을 사용한 파일 읽기

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineBuffer {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("src/main/java/javaio/BufferedReaderWriter.java"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int line = 1;
		while(true) {
			String str = null;
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if(str == null) break;
			System.out.println(line + "\t" + str);
			
			line ++;
			
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
