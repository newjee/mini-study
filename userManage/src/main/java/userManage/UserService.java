package userManage;

import java.util.Iterator;
import java.util.List;

public interface UserService {
	//회원정보 등록
	public void addUser(User user);
	//회원정보 수정 -> user.getEmail()에 해당하는 회원 수정
	public boolean updateUser(User user);
	//삭제
	public boolean deletUser(String email);
	//모든 회원 반환
//	public List<User> getUsers();
	public Iterator<User> getUsers();
	//email에 해당하는 회원정보가 있을 때 0보다 큰 값 반환 
	public boolean exists(String email);
}
