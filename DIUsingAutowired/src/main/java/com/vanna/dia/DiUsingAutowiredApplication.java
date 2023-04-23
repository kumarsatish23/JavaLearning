package com.vanna.dia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiUsingAutowiredApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=  SpringApplication.run(DiUsingAutowiredApplication.class, args);
		Student s=context.getBean(Student.class,args);
		s.display();
	}

}
