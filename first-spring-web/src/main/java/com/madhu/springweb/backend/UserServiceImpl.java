package com.madhu.springweb.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.madhu.springweb.model.User;

@Component
public class UserServiceImpl {
	
	@Autowired
	private UserDao userDao;

	public void createUser(User user) {
		userDao.insertUser(user);
	}	
}
