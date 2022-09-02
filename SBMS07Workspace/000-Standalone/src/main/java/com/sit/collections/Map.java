package com.sit.collections;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		HashMap map= new HashMap();
		map.put("studentId", 101);
		map.put("studentName", "apa");
		map.put("studentRollNo", "14Wl1a04b4");
		map.put("studentEmail", "saikumar35555@gmail.com");
		map.put("studentId", "saikumar35555@gmail.com");
		System.out.println(map);
		
		for(Object kry : map.keySet()) {
		
		System.out.println(map.get(kry));
	}
}
}
