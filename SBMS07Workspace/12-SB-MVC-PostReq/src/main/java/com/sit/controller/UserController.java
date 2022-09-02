package com.sit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	
	@GetMapping("/loadform")
	public String loadUserForm() {
		return "index";
	}
	
	@PostMapping("/saveuser")
	public String saveUser(HttpServletRequest request, Model model) {
		
	String uid=request.getParameter("uid");
	String uname=request.getParameter("uname");
	String phno=request.getParameter("phno");
	System.out.println("uid"+uid);
	System.out.println("uname"+uname);
	System.out.println("phno"+phno);
		
		return "success";
		
	}

}
