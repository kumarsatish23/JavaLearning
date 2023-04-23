package com.vanna.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.vanna.project.Model.Users;
import com.vanna.project.repository.UserRepository;
import com.vanna.project.response.ResponseHandler;

@Service
public class UserDetailsService {

	@Autowired
	private UserRepository repository;
	
	public ResponseEntity<Object> loadUserByUsernameandPassword(String username, String password) {
	
		 String dbpassword =repository.getUsername(username);
		 if(dbpassword==null) {
			 return ResponseHandler.generateResponse("Username Not available",HttpStatus.INTERNAL_SERVER_ERROR);
		 }
         if(dbpassword.equals(password))
        	 		return ResponseHandler.generateResponse("Signed In Succesfully",HttpStatus.OK);
         else
        	 return ResponseHandler.generateResponse("Incorrect username Or Password", HttpStatus.INTERNAL_SERVER_ERROR);	
	}
}
