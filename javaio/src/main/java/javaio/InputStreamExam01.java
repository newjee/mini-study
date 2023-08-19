package javaio;

import java.io.IOException;
import java.io.InputStream;

/*
 * 1바이트 = 8bit 000000000~11111111
 * read() method 가 읽어들일 수 있는 정보.
 * 바이트 단위  read
 */
public class InputStreamExam01 {

	public static void main(String[] args) {
		InputStream in = null;
		
		try {
			//int 로 입력 받는 이유 : EOF -> -1의 보수 11111111를 구분하기 위
			int data = in.read();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			}catch(Exception ex2) {
				System.out.println("io 오류 : " + ex2);
			}
		}
		
	}

}
