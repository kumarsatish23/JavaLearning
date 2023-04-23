package com.vanna.RestModel;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="authorstest")
@XmlRootElement
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	
	@OneToMany(mappedBy="author", cascade={CascadeType.ALL})
    private List<Book> book;
	
	@OneToOne(mappedBy="author", cascade={CascadeType.ALL})
    private Publisher publisher;
 
    
	
//	
	public Author() {
		super();
	}

	
	public Author(Integer id, String name, List<Book> book, Publisher publisher) {
	super();
	this.id = id;
	this.name = name;
	this.book = book;
	this.publisher = publisher;
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
//
	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}


	public Publisher getPublisher() {
		return publisher;
	}


	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
		
	
}
