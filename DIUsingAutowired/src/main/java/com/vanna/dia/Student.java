package com.vanna.dia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	private Technologies tech;

	private Integer studentId;
	private String studentName;
	private String courseName;
	private Technologies techns;
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
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Technologies getTechns() {
		return techns;
	}
	public void setTechns(Technologies techns) {
		this.techns = techns;
	}
	
	public void display() {
		System.out.println("Object Returned Succesfully");
		tech.tech();
	}
}
