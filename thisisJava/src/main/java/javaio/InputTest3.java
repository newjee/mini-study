package javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class InputTest3 {

	public static void main(String[] args) {
		try {
			Reader r = null;

			r = new FileReader("/tmp/teest.txt");
			while (true) {
				int data = r.read();
				if (data == -1)
					break;

				System.out.print((char) data);
			}

			r.close();
			System.out.println();

			// 문자 배열로 읽기

			r = new FileReader("/tmp/teest.txt");
			char[] data = new char[100];
			while (true) {
				int num = r.read(data);
				if (num == -1)
					break;
				for (int i = 0; i < num; i++) {
					System.out.print(data[i]);
				}
			}

			r.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
