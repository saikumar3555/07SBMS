package com.sit.convertors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sit.domain.Student;

public class JSONSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		Student s = new Student();
		s.setStudentId(1006);
		s.setStudentName("Saikumar");
		s.setStudentAge(24);
		
		//JACKSON Logic (Convertin Java object to json)
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(s);
		System.out.println(jsonString);
	}
}
