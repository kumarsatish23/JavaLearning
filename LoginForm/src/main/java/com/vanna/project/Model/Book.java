package com.vanna.project.Model;

import javax.persistence.Column;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
//import javax.persistence.JoinColumn;
// javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="books2")
@SecondaryTable(name="publishers2", pkJoinColumns = @PrimaryKeyJoinColumn(name="Books_bookId"))
public class Book {

	@Id
	private Integer bookId;
	private String bookName;
	
	
	@Column(name="publisher", table = "publishers2")
	private String publishername;
	

	public Book() {
		super();
	}
	
	
	
	public Book(Integer bookId, String bookName, String publishername) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.publishername = publishername;
	}



	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getPublishername() {
		return publishername;
	}


	public void setPublishername(String publishername) {
		this.publishername = publishername;
	}

	
	
}
