package javaio;
// 조립해서 프로그래밍 

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardIOExam {

	public static void main(String[] args) throws Exception {
		//키보드 입력 : System.in (InputStream 주인공)
		//출력 : System.out (OutputStream 주인공)
		//키보드를 입력 : char 단위 입출력->
		//한줄 읽기 : BufferedReader ->readline 메소드
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		while( (line = br.readLine()) != null ) {
			System.out.println("읽어들인값: " + line);
		}
		br.readLine();
		
	}

}

