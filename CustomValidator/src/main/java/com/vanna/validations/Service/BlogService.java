package com.vanna.validations.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanna.validations.Model.Blog;
import com.vanna.validations.repository.BlogRepository;

@Service
public class BlogService {

	@Autowired
	private BlogRepository repository;
	
	public List<Blog> allBolgs(){
		return repository.findAll();
	}
	
	public Blog saveBlog(Blog newblog)
	{
		Blog blog=repository.save(newblog);
		return blog;
	}
}
