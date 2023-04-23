package com.vanna.oauth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanna.oauth.model.oauthemployee;
import com.vanna.oauth.repo.Oauthrepo;

@Service
public class oauthservice {
	@Autowired
	private Oauthrepo repo;

	public oauthemployee getemployee() {
		
		return repo.getemployee();
	}

}
