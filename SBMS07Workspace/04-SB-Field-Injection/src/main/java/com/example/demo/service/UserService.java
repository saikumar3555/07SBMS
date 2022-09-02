package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private  UserDao userDao;
	
	

	
	
	public void getelementById(int id) {
		userDao.getElementById(id);
	}
}
