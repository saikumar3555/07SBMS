package com.sit.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Setter;

@Data
@Entity
@Setter
@Table(name="STUDENTS_DTLS")
public class Student {
	
	@Id
	@Column(name = "STUDENT_ID")
	private Integer studentId;
	
	@Column(name = "STUDENT_EMAIL")
	private String studentEmail;
	
	@Column(name = "STUDENT_AGE")
	private Integer student_Age;
	

	
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

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

	public Integer getStudent_Age() {
		return student_Age;
	}

	public void setStudent_Age(Integer student_Age) {
		this.student_Age = student_Age;
	}

	@Column(name = "STUDENT_NAME")
	private String studentName;
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", student_Age=" + student_Age + "]";
	}

	
}
