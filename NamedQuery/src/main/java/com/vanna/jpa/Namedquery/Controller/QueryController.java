package com.vanna.jpa.Namedquery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanna.jpa.Namedquery.Entity.City;
import com.vanna.jpa.Namedquery.Service.QueryService;

@RestController
public class QueryController {

	@Autowired
	private QueryService service;
	
	@GetMapping("/showcities")
	public List<City> fincities() {
		var cities=(List<City>)service.getAllByName();
		return cities;
	}
}
