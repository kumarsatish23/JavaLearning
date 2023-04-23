package com.vanna.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class SecurityController {
	
	@GetMapping
	public String text() {
		return "Welcome to Spring Security";
	}

}
