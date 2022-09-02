package com.sit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sit.domain.User;

@Controller
public class UserController {
	
	
@GetMapping("/displayForm")
public String displayUserForm(Model model) {
	User user = new User();
	model.addAttribute("user",user);
	return "userForm";
}


@PostMapping("/submitForm")
public String saveUserDtls(User user, Model model) {
	
	System.out.println(user);
	return "userRegSuccess";
}

}
