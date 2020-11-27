package com.example.JunitMockito.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private int studentId;
	private String studentName;
	private String StudentCourse;
	
	
	public Student() {
		
	}
	
	public Student(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
		this.studentId = i;
		this.StudentCourse = string2;
		this.studentName = string;
	}

	public int getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCourse() {
		return StudentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		StudentCourse = studentCourse;
	}
	
	

}
