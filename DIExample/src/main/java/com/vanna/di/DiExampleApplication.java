package com.vanna.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiExampleApplication {

	public static void main(String[] args) {
	//	
	//	
		ConfigurableApplicationContext context=SpringApplication.run(DiExampleApplication.class, args);
		Customer c= context.getBean(Customer.class);
		c.display();
	//	
	}

}
