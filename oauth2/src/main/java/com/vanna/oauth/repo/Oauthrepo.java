package com.vanna.oauth.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vanna.oauth.model.oauthemployee;

@Repository
public interface Oauthrepo extends JpaRepository<oauthemployee, Integer>{
	
	@Query(value="select * from oauthemployee where id=1",nativeQuery=true)
	oauthemployee getemployee();

}
