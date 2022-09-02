package com.sit.restcontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sit.domain.Student;
import com.sit.repository.StudentRepository;

@RestController
public class StudentRestController {

	@Autowired
	private StudentRepository studentRepo;
	
	
	@GetMapping("/student/{studentId}")
	private Student studentDtls(@PathVariable int studentId) {
		Optional<Student> findById = studentRepo.findById(studentId);
		if(findById.isPresent()) {
			return findById.get();
		}else {
			return null;
		}
		
	}
	


	@GetMapping("/student")
	private Iterable<Student> studentDtls() {
		  Iterable<Student> findAll = studentRepo.findAll();
		
		return findAll;
		
	}
}
