package com.vanna.filters.SpringFilter2.Entity;

public class Student {
	private Integer studentId;
	private String studentName;
	private String major;
	
	
	public Student() {
		super();
	}


	public Student(Integer studentId, String studentName, String major) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.major = major;
	}


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


	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
