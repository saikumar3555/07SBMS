package com.sit;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import com.sit.repository.Student;
import com.sit.repository.StudentRepository;

import antlr.collections.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		
		// To save or update Record 
		/*Student s1 = new Student();
		s1.setStudentId(6);
		s1.setStudentName("Vijay");
		s1.setStudentEmail("Vijay@sit.com");
		s1.setStudent_Age(24);

		studentRepository.save(s1);*/
		
		
		/*Optional<Student>  findById=studentRepository.findById(101);
		if(findById.isPresent()) {
			System.out.println(findById.get().toString());
		}*/
		
		/*Iterable<Student> findAllById = studentRepository.findAllById(Arrays.asList(101,102,103));
		
		for (Student student : findAllById) {
		
		      System.out.println(student.getStudentId());
		}*/
		
		//studentRepository.deleteById(101);
		String name = "Srujan";
		
		//Student findByStudentName = studentRepository.findByStudentName("Vijay");
		//System.out.println(findByStudentName);
		
		
		
		/*java.util.List<Student> findByStudentEmail = studentRepository.findByStudentEmail("Ramya.1@sit.com");
		findByStudentEmail.forEach(student->{
			System.out.println(student.toString());
		});*/
		
		
		//java.util.List<Student> byStudentEmailAndAge = studentRepository.getByStudentEmailAndAge("Ramya.1@sit.com",25);
		
		//java.util.List<Student> findAll = studentRepository.getAllStudents();
		
		//java.util.List<Student> findAll = studentRepository.findAll(Sort.by(Sort.Direction.ASC, "studentName"));
		
		Student s= new Student();
		s.setStudentName("Srujan");
		 Example<Student> exampleObj = Example.of(s);
		 java.util.List<Student> findAll = studentRepository.findAll(exampleObj);
		 
		
		findAll.forEach(student->{
			System.out.println(student);
		});
		context.close();
		
		
	}

}
