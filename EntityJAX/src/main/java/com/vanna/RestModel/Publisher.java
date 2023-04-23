package com.vanna.RestModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

@Entity
@Table(name="publisherstest")
public class Publisher {
	
	@Id
	private Integer pid;
	private String pname;
	
	@OneToOne
    @PrimaryKeyJoinColumn
    private Author author;
	
	public Publisher() {
		super();
	}
	
	

	public Publisher(Integer pid, String pname, Author author) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.author = author;
	}



	


	public Integer getPid() {
		return pid;
	}



	public void setPid(Integer pid) {
		this.pid = pid;
	}



	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	@XmlInverseReference(mappedBy="publisher")
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
}
