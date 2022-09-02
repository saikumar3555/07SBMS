package com.sit.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sit.domain.Student;
@Repository
 public interface StudentRepository extends CrudRepository<Student, Serializable>{
	 
	 
 }