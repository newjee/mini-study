package userManage;

import java.util.List;

public class UserMain {

	public static void main(String[] args) {
		UserUI userUI = new UserUI();
		UserDao userDao = new UserDao("/tmp/users.dat");
//		List<User> users = userDao.getUsers();
		UserService userService = new UserServiceInMemory(userDao.getUsers());

		while (true) {
			int menuId = userUI.menu();
			if (menuId == 5) {
				System.out.println("종료합니다.");
//				userDao.saveUser(users);
				userDao.saveUser(userService.getUsers());
				break;
			}
			if (menuId == 1) {
//				User user = userUI.regMenu();
//				userService.addUser(user);
//				
				userService.addUser(userUI.regMenu());
				System.out.println("등록되었습니다.");
			}
			if (menuId == 2) {
				System.out.println(" ");
//				userUI.printUserList(users);
				userUI.printUserList(userService.getUsers());
			}
			if (menuId == 3) {
				String email = userUI.inputEmail();
				boolean isFindEmail = userService.exists(email);
				
				if(isFindEmail) {
					User updateUser = userUI.inputUser(email);
					userService.updateUser(updateUser);
					System.out.println("수정되었습니다.");
				}
				else
					System.out.println("수정할 회원이 없습니다.");
//				int findindex = -1;
//				for (int i = 0; i < users.size(); i++) {
//					User u = users.get(i);
//					if (u.getEmail().equals(email)) {
//						findindex = i;
//						break;
//					}
//				}
//				if (findindex != -1) {
//					User updateUser = userUI.inputUser(email);
//					users.remove(findindex);
//					users.add(updateUser);
//					System.out.println("수정되었습니다.");
//				}
//				if (findindex == -1) {
//					System.out.println("수정할 회원 정보가 없습니다.");
//				}
				System.out.println();
			}
			if(menuId == 4) {
				String email = userUI.inputEmail();
				boolean isFindEmail = userService.exists(email);
				
				if(isFindEmail) {
					userService.deletUser(email);
					System.out.println("삭제되었습니다.");
				}
				else
					System.out.println("삭제할 회원이 없습니다.");
//				int findindex = -1;
//				for (int i = 0; i < users.size(); i++) {
//					User u = users.get(i);
//					if (u.getEmail().equals(email)) {
//						findindex = i;
//						break;
//					}
//				}
//				if (findindex != -1) {
//					users.remove(findindex);
//					System.out.println("삭제되었습니다.");
//				}
//				if (findindex == -1) {
//					System.out.println("삭제할 회원 정보가 없습니다.");
//				}
				System.out.println();
				
				
				
			}
		}
	}

}
