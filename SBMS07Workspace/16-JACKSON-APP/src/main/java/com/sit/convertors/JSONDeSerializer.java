package com.sit.convertors;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sit.domain.Student;

public class JSONDeSerializer {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		// Jakson  logic (Converting json to java object)
		ObjectMapper mapper = new ObjectMapper();
		Student obj= mapper.readValue(new File("student.json"), Student.class);
		System.out.println(obj);
	}
}
