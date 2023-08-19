package javaio;
// 역직렬화.
// 객체 읽기.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutputStream {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			//FileOutputSream : 주스트림 
			fos = new FileOutputStream("/tmp/object.dat"); // 주 스트림
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ObjectOutputStream oos = null;
		try {
			//ObjectOutputStream : 보조스트림
			oos = new ObjectOutputStream(fos); // 보조스트림
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/object.dat"));
		
		// 객체 생성
		Member m1 = new Member("fall", "가을");
		Product p1 = new Product("노트", 159999);
		int[] arr1 = {1,2,3};
		
		
		
		try {
			// 객체 직렬화 -> 파일 저장
			oos.writeObject(m1);
			oos.writeObject(p1);
			oos.writeObject(arr1);
			
			oos.flush();
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//=================input====================
		//FileInputStream : 주스트림
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("/tmp/object.dat");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			//ObjectInputStream : 보조스트림
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//파일을 읽고 역직렬화 -> 객체로 복원
			Member m2 = (Member)ois.readObject();
			Product p2 = (Product)ois.readObject();
			int[] arr2 = (int[]) ois.readObject();

			ois.close(); fis.close();
			//복원된 내용 확인
			System.out.println(m2);
			System.out.println(p2);
			System.out.println(Arrays.toString(arr2));
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		
		}
		
		
		
	}

}
