package com.vanna.security.userdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vanna.security.model.User;
import com.vanna.security.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
		
	public UserDetails loadusersByName(String username) throws UsernameNotFoundException{
		
		User user=repo.findByUserName(username)
				.orElseThrow(()-> new UsernameNotFoundException("User Not Found"));
		return user;
		
	}
	
	public void createUser(UserDetails user) {
		repo.save((User)user);
	}
}
