package com.vanna.di;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	private Integer customerid;
	private String customerName;
	private String courseName;
	
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void display() {
		
		System.out.println("Object Returned Succesfully");
	
	}
}
