package javaio;
//파일 문자 쓰기
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class OutputTest {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("/tmp/teest.txt");
			
			char a ='A';
			writer.write(a);
			
			char[] arr = {'C', 'D', 'E'};
			writer.write(arr);
			
			writer.write("FGH");
			
			writer.flush();
			
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
