package com.vanna.validations.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vanna.validations.Model.Blog;
//import com.vanna.validations.Entity.Blog;
import com.vanna.validations.Service.BlogService;

@RestController
public class BlogController {

	
	@Autowired
	private  BlogService service;
	
	@GetMapping("/all")
	public List<Blog> findAllBlogs() {
	       return service.allBolgs();
	   }
	@PostMapping("/save")
	@ResponseStatus(code=HttpStatus.CREATED)
	public Blog newBlog(@Valid @RequestBody Blog blog)
	{
		return service.saveBlog(blog);
	}
	
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
		   Map<String, String> errors = new HashMap<>();	 
		   ex.getBindingResult().getFieldErrors().forEach(error ->
		           errors.put(error.getField(), error.getDefaultMessage()));	 
		   return errors;
		}


}
