package com.vanna.filters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/test")
	public String testFilter() {
		System.out.println("Executing multiple filters");
		return "OK";
	}
}
