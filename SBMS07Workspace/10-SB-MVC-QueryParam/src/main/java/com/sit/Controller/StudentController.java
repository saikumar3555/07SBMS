package com.sit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	
	
	@GetMapping("/getname")
	public String getStudentName(@RequestParam("id") String studentId,Model model) {
		String name ="";
		System.out.println("name::::::::::::"+name);
		if("101".equalsIgnoreCase(studentId)) {
			name="Sai";
		}else if("102".equalsIgnoreCase(studentId)) {
			name="Rohan";
		}else{
			name="Invalid ID";
		}
		
		model.addAttribute("name",name);
		
		
		return "studentDetails";
	}

}
