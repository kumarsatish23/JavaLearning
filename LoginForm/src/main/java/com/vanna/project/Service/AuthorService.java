package com.vanna.project.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.vanna.project.Model.Author;
import com.vanna.project.exceptions.ProductNotFoundException;
import com.vanna.project.response.ResponseHandler;

@Service
public class AuthorService {

	@Autowired
	private com.vanna.project.repository.AuthRepository repository;

	public ResponseEntity<Object> addAuthor(Author author) {
		Author author2=null; 
		try {
				author2=repository.save(author);
		}
		catch(Exception e) {
			return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(author2==null) {
			return ResponseHandler.generateResponse("Something Error Occured, Check your details correctly", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		else
			return ResponseHandler.generateResponse("Succesfully Added", HttpStatus.OK);
	}
	
	
	public ResponseEntity<Author> updateAuthor(Integer id, Author author) {   
		Integer exceptionid=repository.getId(id);
		
		if(exceptionid==null)
		{
			throw new ProductNotFoundException();
		}
		
		Author author2 = repository.getById(id);
			author2.setId(author.getId());
		author2.setName(author.getName());
		author2.setBook(author.getBook());
        final Author updatedEmployee = repository.save(author2);
        return ResponseEntity.ok(updatedEmployee);
	}


	public List<Author> getAllAuthorsIncludingBooks() {
		return repository.findAll();
	}


	public Map<String, Boolean> deleteAuthor(Integer id) {
		// TODO Auto-generated method stub
			Author author=repository.getById(id);
			repository.delete(author);
		Map<String, Boolean> response = new HashMap();
        response.put("deleted", Boolean.TRUE);
        return response;
	}


}
