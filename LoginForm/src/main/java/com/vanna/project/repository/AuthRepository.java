package com.vanna.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vanna.project.Model.Author;
import com.vanna.project.Model.Book;


public interface AuthRepository extends JpaRepository<Author, Integer> {

	@Query(value="select id from authors2 where id=?1", nativeQuery = true)
	Integer getId(Integer id);
	
//	Book save(Author author);

}
