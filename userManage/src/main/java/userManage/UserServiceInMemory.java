package userManage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserServiceInMemory implements UserService{
	private List<User> users;
	
	public UserServiceInMemory(){
		this.users = new ArrayList<>();
	}
	public UserServiceInMemory(List<User> users) {
		this.users = users;
	}
	@Override
	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public boolean updateUser(User user) {
//		int findindex = -1;
//		for (int i =0 ; i<users.size(); i++) {
//			if(users.get(i).getEmail().equals(user.getEmail())) {
//				findindex = i;
//				users.remove(i);
//				break;
//			}
//		}
//		if (findindex != -1) {
//			users.add(user);
//			return true;
//		}else  { //(findindex == -1 )
//			return false;
//		}
		boolean deletFlag = deletUser(user.getEmail());
		if(deletFlag) {
			users.add(user);
			return true;
		}else {
			return false;
		}
	}

	
	@Override
	public boolean exists(String email) {
		if (findindex(email)>=0)
			return true;
		else
			return false;
	}
	
	
	private int findindex(String email){
		int findindex = -1;
		for (int i =0 ; i<users.size(); i++) {
			if(users.get(i).getEmail().equals(email)) {
				findindex = i;
				break;
			}
		}
		return findindex;
	}
	@Override
	public boolean deletUser(String email) {
		int findindex = findindex(email);
		if(findindex > -1) { 
			users.remove(findindex);
			return true;
		}
		else
			return false;
		
//		for (int i =0 ; i<users.size(); i++) {
//			if(users.get(i).getEmail().equals(email)) {
//				findindex = i;
//				users.remove(i);
//				break;
//			}
//		}
//		if (findindex != -1) {
//			return true;
//		}
//		else  { //(findindex == -1 )
//			return false;
//		}

	}

	@Override
	public Iterator<User> getUsers() {
		return users.iterator();
	}

}
