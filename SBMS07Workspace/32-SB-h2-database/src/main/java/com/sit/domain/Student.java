package com.sit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_MASTER")
public class Student {

	@Id
	private int studentId;
	@Column(name="student_name")
	private String studentName;
	@Column(name="student_age")
	private int studentAge;
	@Column(name="student_email")
	private String studebtEmail;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudebtEmail() {
		return studebtEmail;
	}
	public void setStudebtEmail(String studebtEmail) {
		this.studebtEmail = studebtEmail;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studebtEmail=" + studebtEmail + "]";
	}
	
}
