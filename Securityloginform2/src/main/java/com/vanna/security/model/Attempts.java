package com.vanna.security.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Attempts {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String username;
	private Integer attempts;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAttempts() {
		return attempts;
	}
	public void setAttempts(Integer attempts) {
		this.attempts = attempts;
	}
	
	
}
