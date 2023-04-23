package com.vanna.NativeQuery.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="authors")
public class Author {

	@Id
	private Integer id;
	private String firstname;
	private String lastname;
	
	public Author() {
		super();
	}

	public Author(Integer id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstname = firstName;
		this.lastname = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		this.lastname = lastName;
	}
	
	
}
