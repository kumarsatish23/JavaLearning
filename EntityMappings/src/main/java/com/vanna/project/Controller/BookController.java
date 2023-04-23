package com.vanna.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vanna.project.Model.Author;
import com.vanna.project.Model.Book;




@RestController
public class BookController {

	@Autowired
	private com.vanna.project.Service.AuthorService service;
	
	@PostMapping("/add")
	public Author addB(@RequestBody Author author) {
		return service.addAuthor(author);
	}
}
