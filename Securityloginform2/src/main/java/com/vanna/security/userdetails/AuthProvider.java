package com.vanna.security.userdetails;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.vanna.security.model.Attempts;
import com.vanna.security.model.User;
import com.vanna.security.repository.AttempRepository;
import com.vanna.security.repository.UserRepository;

@Component
public class AuthProvider implements AuthenticationProvider{
	
	private static final int ATTEMPTS_LIMIT = 3; 
	
	@Autowired
	private UserService serv;
	@Autowired
	private PasswordEncoder encoder;
	@Autowired
	private AttempRepository repository;
	@Autowired
	private UserRepository userrepo;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getName();
		Optional<Attempts> userAttempts= repository.findAttemptByUserName(username);
		if(userAttempts.isPresent())
		{
			Attempts attempts=userAttempts.get();
			attempts.setAttempts(0);
			repository.save(attempts);
		}
		return authentication;
	}
	
	private void processFailedAttempts(String username, User user) { 
	      Optional<Attempts> 
	      userAttempts = repository.findAttemptByUserName(username); 
	      if (userAttempts.isEmpty()) { 
	         Attempts attempts = new Attempts(); 
	         attempts.setUsername(username); 
	         attempts.setAttempts(1); 
	         repository.save(attempts); 
	      } else {
	         Attempts attempts = userAttempts.get(); 
	         attempts.setAttempts(attempts.getAttempts() + 1); 
	         repository.save(attempts);
	      
	         if (attempts.getAttempts() + 1 > 
	         ATTEMPTS_LIMIT) {
	            user.setAccountNonLocked(false); 
	            userrepo.save(user); 
	            throw new LockedException("Too many invalid attempts. Account is locked!!"); 
	         } 
	      }
	   }
	

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return true;
	}

	
}
