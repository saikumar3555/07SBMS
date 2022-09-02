package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;

@Service
public class UserService {
	private  UserDao userDao;
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public UserService() {
		System.out.println("UserService :: 0-Param constructor");
	}

	
	public void getelementById(int id) {
		userDao.getElementById(id);
	}
}
