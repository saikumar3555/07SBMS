package com.sit.domain;

import java.util.Arrays;

public class Student {
	
	private String studentName;
	private String studentEmail;
	private String gender;
	private String courser;
	private String[] timings;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourser() {
		return courser;
	}
	public void setCourser(String courser) {
		this.courser = courser;
	}
	public String[] getTimings() {
		return timings;
	}
	public void setTimings(String[] timings) {
		this.timings = timings;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentEmail=" + studentEmail + ", gender=" + gender
				+ ", courser=" + courser + ", timings=" + Arrays.toString(timings) + "]";
	}
		

}
