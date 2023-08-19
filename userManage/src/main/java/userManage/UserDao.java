package userManage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
 * 파일에서 List<User> 정보 저장 or 읽어오는 기
 */
public class UserDao {
	private String filename;
	
	public UserDao(String filename) {
		this.filename = filename;
	}
	
	public void saveUser(Iterator<User> iter) { //List<User> list
		List<User> users = new ArrayList<>();
		while(iter.hasNext()) {
			User user = iter.next();
			users.add(user);
		}
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))){
			out.writeObject(users);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public List<User> getUsers(){ //List<User> getUsers()
		File file = new File(filename);
		if(!file.exists()) {
			return new ArrayList<>();
		}
		
		List<User> list = null;
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))){
			list = (List<User>)in.readObject();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
	

}
