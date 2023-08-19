package practice;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import userManage.User;

public class ObjectOutputExam {

	public static void main(String[] args) throws Exception{
		User user = new User("hong@ecample.com", "홍길동", 1992);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/tmp/user.dat") );
		out.writeObject(user);
		out.close();
		
	}

}
