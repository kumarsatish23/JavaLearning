package com.vanna.Exceptions.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vanna.Exceptions.Model.Product;
import com.vanna.Exceptions.exception.ProductNotFoundException;

@RestController
public class MainController {

	private static Map<String, Product> productRepo=new HashMap<>();
	static {
		Product honey=new Product();
		honey.setId("1");
		honey.setName("Honey");
		productRepo.put(honey.getId(), honey);
		
		Product almond=new Product();
		almond.setId("2");
		almond.setName("Almond");
		productRepo.put(almond.getId(), almond);
	}
	
	@GetMapping("/products/{id}")
	public Product allProducts(@PathVariable("id") String Id)
	{
		return productRepo.get(Id);
	}
	
	@PostMapping("/products/{id}")
	public ResponseEntity<Object> updateProduct(@PathVariable("id") String Id, @RequestBody Product product)
	{
		if(!productRepo.containsKey(Id))
			throw new ProductNotFoundException();
		productRepo.remove(Id);
		product.setId(Id); 
		productRepo.put(Id, product);
		return new ResponseEntity<>("Product is Succesfully Updated",HttpStatus.OK);
	}
	
}
