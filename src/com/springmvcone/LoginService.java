package com.springmvcone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginService {
	
	@Autowired
	LoginDAOImpl login;
	
	public boolean check(String name, String password) {
		List<User> users = login.getData();
		
		for(User u:users) {
			if(u.getName().equals(name) && u.getPassword().equals(password))
				return true;
		}
		
		return false;
	}
}
