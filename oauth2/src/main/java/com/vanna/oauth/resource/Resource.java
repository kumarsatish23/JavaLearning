package com.vanna.oauth.resource;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanna.oauth.model.oauthemployee;
import com.vanna.oauth.service.oauthservice;

@RestController

public class Resource {	

	@Autowired
	private oauthservice serv;
	
	@GetMapping("/user/me")
    public Principal user(Principal principal) {
        return principal;
    }
	
	@GetMapping("/api/data")
	public oauthemployee getall() {
		 oauthemployee employee=serv.getemployee();
		 return employee;
	}
}
