package com.sit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface StudentRepository extends JpaRepository<Student, Serializable>{

	
	 public Student findByStudentName(String studentName);
	 
	 public java.util.List<Student>  findByStudentEmail(String studentEmail);
	 
	 @Query("from Student where studentEmail=:sEmail and student_Age = :sAge")
	 public java.util.List<Student> getByStudentEmailAndAge(String sEmail, Integer sAge);
	 
	 @Query( value = "select * from students_dtls", nativeQuery = true)
	 public java.util.List<Student> getAllStudents();
}
