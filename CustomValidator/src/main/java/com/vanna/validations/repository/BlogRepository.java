package com.vanna.validations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vanna.validations.Model.Blog;


public interface BlogRepository extends JpaRepository<Blog, Long>{

}