package com.sit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	
	
	@GetMapping("/getname/{sid}")
	public String getStudentName(@PathVariable("sids") String studentId,Model model) {
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



@GetMapping("/getname/{101}/test")
public @ResponseBody String getStudentName1(String studentId,Model model) {
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
	
	
	return  name;
}

}
	
	

