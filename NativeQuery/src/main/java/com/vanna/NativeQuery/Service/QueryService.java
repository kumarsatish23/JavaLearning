package com.vanna.NativeQuery.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanna.NativeQuery.AuthorRepository.Authordao;
import com.vanna.NativeQuery.Model.Author;

@Service
public class QueryService {

	@Autowired
	private Authordao repository;
	
	public List<Author> getAuthorsByFirstName(String firstname){
		return repository.getAuthorsbyFirstName(firstname);
	}
	
	public List<Author> getAuthorByLN(String lastname){
		var authors=repository.getAuthorsByLastName(lastname);
		return authors;
	}
	
}
