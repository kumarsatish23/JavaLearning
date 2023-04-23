package com.vanna.jpa.Namedquery.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanna.jpa.Namedquery.Entity.City;
import com.vanna.jpa.Namedquery.repository.DAO;

@Service
public class QueryService {

	@Autowired
	private DAO repository;
	
	public List<City> getAllByName(){
		 var cities=repository.findAllOrdByNameDesc();
		return cities;
	}
}
