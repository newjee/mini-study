package javaio;
// 파일 바이트 읽기
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("/tmp/test.db");
			byte[] data = new byte[100];
			
			while (true) {
				int index = is.read(data);
				if (index == -1)
					break;
				
				for (int i = 0; i<index; i++) {
					System.out.println(data[i]);
				}
				
			}
			is.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
