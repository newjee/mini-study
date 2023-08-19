package practice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import userManage.User;

public class ObjectInputExame2 {

	public static void main(String[] args) throws Exception{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("/tmp/userlist.dat"));
		ArrayList<User> list = (ArrayList)in.readObject();
		
		
		in.close();
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
		}
	}

}
