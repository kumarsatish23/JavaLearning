package com.vanna.oauth.resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Resource {	

	@GetMapping("/api/getdata")
	public String getData(){
		return "Authorized by OAuth2.0";
	}
}
