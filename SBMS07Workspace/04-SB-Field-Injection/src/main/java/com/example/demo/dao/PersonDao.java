package com.example.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {
	
public void getElementById(int id) {
		
		if(id == 101) {
			System.out.println("John");
		}else if (id== 102) {
			System.out.println("Sohn");
		}else {
			System.out.println("Hybird");	
		}
	}

}
