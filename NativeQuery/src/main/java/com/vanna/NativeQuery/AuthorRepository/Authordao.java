package com.vanna.NativeQuery.AuthorRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vanna.NativeQuery.Model.Author;

public interface Authordao extends JpaRepository<Author, Integer> {

	//NativeQuery
	@Query(value= "select * from authors a where a.firstname= :firstname", nativeQuery=true)
	List<Author> getAuthorsbyFirstName(String firstname);
	
	
	//CustomQuery
	@Query("select a from Author a where a.lastname= :lastname")
	List<Author> getAuthorsByLastName(String lastname);
	
}
