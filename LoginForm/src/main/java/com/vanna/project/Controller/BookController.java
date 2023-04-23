package com.vanna.project.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanna.project.Model.Author;
import com.vanna.project.Service.AuthorService;
import com.vanna.project.Service.UserDetailsService;
import com.vanna.project.dto.LoginDto;




@RestController
@CrossOrigin
@RequestMapping("/author")
public class BookController {

	@Autowired
	private AuthorService service;
	
	@Autowired
	private UserDetailsService service2;
	
	@PostMapping("/login")
	public ResponseEntity<Object> Userlogin(@RequestBody LoginDto dto){
		
		return service2.loadUserByUsernameandPassword(dto.getUsername(), dto.getPassword());
	}
	
	@GetMapping("/string")
	public String getString() {
		return "Hi Saivarma";
	}
	
	@GetMapping("/getall")
	public List<Author> getallAuthors(){
		return service.getAllAuthorsIncludingBooks();
	}
	
	@PostMapping("/addauthor")
	public ResponseEntity<Object> addB(@Valid @RequestBody Author author) {
		return service.addAuthor(author);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Author> update(@PathVariable("id") Integer id,@Valid @RequestBody Author author) {
		return service.updateAuthor(id,author);
	}
	
	@DeleteMapping("/delete/{id}")
	public Map<String, Boolean> deleteAuthor(@PathVariable("id") Integer id) {
		return service.deleteAuthor(id);
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
		   Map<	String, String> errors = new HashMap<>();	 
		   ex.getBindingResult().getFieldErrors().forEach(error ->
		           errors.put(error.getField(), error.getDefaultMessage()));	 
		   return errors;
		}

}
