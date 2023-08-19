package javaio;

import java.io.File;
import java.io.IOException;

public class TempFile {

	public static void main(String[] args) {
		try {
			File f = File.createTempFile("tmp_", ".dat");
			System.out.println(f.getAbsolutePath());
			
			//자동 소멸 
			System.out.println("60초 동안 멈춰있습니다.");
			try {
				//1000millis = 1sec
				Thread.sleep(60000);
			} catch (InterruptedException e1) {
				System.out.println(e1);
			}
			f.deleteOnExit(); //jvm 종료 시 자동 종
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
