package com.vanna.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vanna.security.model.Attempts;
import com.vanna.security.model.User;

@Repository
public interface AttempRepository extends JpaRepository<Attempts, Integer>{
	
	@Query(value="select * from attempts where username=?1", nativeQuery = true)
	Optional<Attempts> findAttemptByUserName(String username);
	
}
