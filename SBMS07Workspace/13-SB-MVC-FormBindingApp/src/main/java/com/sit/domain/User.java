package com.sit.domain;

import org.springframework.stereotype.Controller;


public class User {
	
	@Override
	public String toString() {
		return "UserController [userId=" + userId + ", userName=" + userName + ", userPhno=" + userPhno + "]";
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getUserPhno() {
		return userPhno;
	}
	public void setUserPhno(Long userPhno) {
		this.userPhno = userPhno;
	}
	private Integer userId;
	private String userName;
	private Long userPhno;

}
