package com.vanna.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vanna.project.Model.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

	
	@Query(value="select password from user2 where username=?1", nativeQuery=true)
	 String getUsername(String username);

	
}
