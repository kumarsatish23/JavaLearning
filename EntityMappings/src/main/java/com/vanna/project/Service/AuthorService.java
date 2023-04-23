package com.vanna.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanna.project.Model.Author;
import com.vanna.project.Model.Book;

@Service
public class AuthorService {

	@Autowired
	private com.vanna.project.repository.AuthRepository repository;

	public Author addAuthor(Author author) {
		return repository.save(author);
	}
}
