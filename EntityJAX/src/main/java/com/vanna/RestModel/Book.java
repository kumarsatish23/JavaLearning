package com.vanna.RestModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

@Entity
@Table(name= "bookstest")
//@SecondaryTable(name="publishertest", pkJoinColumns = @PrimaryKeyJoinColumn(name="authors_id"))
public class Book {

	@Id
	private Integer bookId;
	private String bookName;
	
//	
//	@Column(name="publisher", table = "publishertest")
//	private String publishername;

	@ManyToOne
    @JoinColumn(name="Authors_ID")
    private Author author;

	public Book() {
		super();
	}


	
	public Book(Integer bookId, String bookName, Author author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
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


	@XmlInverseReference(mappedBy="book")
	public Author getAuthor() {
		return author;
	}



	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
}
