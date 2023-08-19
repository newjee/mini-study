package javaio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// 파일 클래스로 파일 생성하고 읽기. => readString
public class FileReadString {

	public static void main(String[] args) {
		String data = "" + "id : winter\n" + "email : winter@naver.com\n" +"tel : 010-1234-1234";
		Path path = Paths.get("/tmp/user.txt");
		
		try {
			Files.writeString(Paths.get("/tmp/user.txt"), data);
			
			System.out.println(Files.probeContentType(path));
			System.out.println(Files.size(path));
			
			String content = Files.readString(path);
			System.out.println(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
