package com.vanna.dia;

import org.springframework.stereotype.Component;

@Component
public class Technologies {

	private Integer techId;
	private String techName;
	
	public Integer getTechId() {
		return techId;
	}
	public void setTechId(Integer techId) {
		this.techId = techId;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	
	public void tech() {
		System.out.println("Successful");
	}
	
}
