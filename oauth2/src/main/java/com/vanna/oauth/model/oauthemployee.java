package com.vanna.oauth.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class oauthemployee {
	
	@Id
	private Integer id;
	private String ename;
	
	public oauthemployee() {
		super();
	}

	public oauthemployee(Integer id, String ename) {
		super();
		this.id = id;
		this.ename = ename;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
}
