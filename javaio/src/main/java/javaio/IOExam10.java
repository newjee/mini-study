package javaio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOExam10 {

	public static void main(String[] args) throws Exception{
		
		
		//키보드 한줄씩 입력
		//system.in => 주인공 -> inputStream
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		System.out.println(line);
		br.close();  
	}

}
