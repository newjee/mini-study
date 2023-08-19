package userManage;

import java.io.Serializable;

public class User implements Serializable{
	
	private String email;
	private String name;
	private int birthYear;
	
	
	public User(String email, String name, int birthYear) {
//		super();
		this.email = email;
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public String getEmail() {
		return email;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", birthYear=" + birthYear + "]";
	}
	
}
