package com.vanna.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vanna.project.Model.Author;
import com.vanna.project.Model.Book;


public interface AuthRepository extends JpaRepository<Author, Integer> {

//	Book save(Author author);

}
