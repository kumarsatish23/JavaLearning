package com.vanna.project.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="authorsdemo")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="ForeignAuthor", referencedColumnName="id")
	public List<Book> book;
	
	
		
	public Author() {
		super();
	}



	public Author(Integer id, String name, List<Book> book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<Book> getBook() {
		return book;
	}



	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	

}
