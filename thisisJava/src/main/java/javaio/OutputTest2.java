package javaio;
// 파일 바이트 쓰기
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputTest2 {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("/tmp/test.db");
			byte[] array = { 10, 20, 30, 40};

			os.write(array, 0, 2);

			os.flush();
			os.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
