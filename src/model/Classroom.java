package model;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
	
	private List<UserAccount> users;

	public Classroom() {
		users = new ArrayList <UserAccount>();
		users.add(new UserAccount( "Jesus",  "123",  "xd",  "Male",  "SIS",  "04/01/2003",	"OperaGX"));
	}
	
	public boolean add(UserAccount newUser) {
		if (users.add(newUser)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean remove(int index) {
		return true;
	}

	public List<UserAccount> getUsers() {
		return users;
	}
	
}
