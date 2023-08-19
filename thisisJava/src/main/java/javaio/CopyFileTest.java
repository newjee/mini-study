package javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileTest {

	public static void main(String[] args) throws Exception {
		String originFileName = "/Users/nabi/Downloads/dora.png";
		String targetFileName = "/Users/nabi/Downloads/doraCCopy.png";
		
		InputStream is = new FileInputStream(originFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		// read(byte[] b) 읽은 바이트를 매개값으로 주어진 배열에 저장 후 읽은 바이트 수를 리턴
		byte[] data = new byte[1024];
		while (true) {
			int num = is.read(data);
			if(num == -1) break;
			os.write(data, 0, num);
			
		}
		
		os.flush();
		os.close();
		is.close();
		
		System.out.println("복사 잘 되었습니다.");
	}

}
