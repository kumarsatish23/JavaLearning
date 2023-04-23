package com.vanna.filters.SpringFilter2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanna.filters.SpringFilter2.Entity.Student;

@RestController
@RequestMapping("/student")
public class FilterController {
	
	@GetMapping("/getstudent")
	public Student getStudent() {
		Student sd=new Student();
		sd.setStudentId(502);
		sd.setStudentName("Saivarma");
		sd.setMajor("Computer Sceince");
		return sd;
	}
}
