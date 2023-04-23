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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.boot.context.properties.bind.DefaultValue;

import com.vanna.project.constrints.ContactNumber;

@Entity
@Table(name="authors2")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotNull
	@Size(min = 2, message = "Name must have at least 2 characters")
	private String name;
	
	@ContactNumber()
	private String phonenumber;

	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="ForeignAuthor", referencedColumnName="id")
	public List<Book> book;
	
	
		
	public Author() {
		super();
	}

	


	public Author(Integer id, @NotNull @Size(min = 2, message = "Title must have at least 2 characters") String name,
			String phonenumber, List<Book> book) {
		super();
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
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

	

	public String getPhonenumber() {
		return phonenumber;
	}




	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}




	public List<Book> getBook() {
		return book;
	}



	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	

}
