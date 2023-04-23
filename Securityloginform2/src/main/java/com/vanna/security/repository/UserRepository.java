package com.vanna.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vanna.security.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query(value="select * from users where username=?1", nativeQuery = true)
	Optional<User> findByUserName(String username);
}
