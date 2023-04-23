package com.vanna.NativeQuery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vanna.NativeQuery.Model.Author;
import com.vanna.NativeQuery.Service.QueryService;

@RestController
public class QueryController {

	@Autowired
	private QueryService service;
	
	@GetMapping("/authorbyfname/{firstname}")
	public List<Author> getAuthor(@PathVariable("firstname") String firstname)
	{
		return service.getAuthorsByFirstName(firstname);
	}
	
	@GetMapping("/bylastname/{lastname}")
	public List<Author> getAuthorLN(@PathVariable("lastname") String lastname)
	{
		return service.getAuthorByLN(lastname);
	}
}
