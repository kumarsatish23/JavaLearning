package com.vanna.validations.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.vanna.validations.Constraints.ContactNumber;

@Entity
@Table(name= "blogdetails")
public class Blog {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	@NotNull
	@Size(min = 2, message = "Title must have at least 2 characters")
	private String title;
	@NotBlank(message = "Editor cannot be blank")
	private String editor;
	@Email(message = "Email should be valid")
	private String email;
	
	@ContactNumber()
	private String phonenumber;
	
	public Blog() {
		super();
	}
	
	
	public Blog(Long id, @NotNull @Size(min = 2, message = "Title must have at least 2 characters") String title,
			@NotBlank(message = "Editor cannot be blank") String editor,
			@Email(message = "Email should be valid") String email, String phonenumber) {
		super();
		this.id = id;
		this.title = title;
		this.editor = editor;
		this.email = email;
		this.phonenumber = phonenumber;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
}
