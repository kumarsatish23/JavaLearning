package com.vanna.Webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "com.vanna.Webservice.Base")
public class BaseImpl implements Base {
	//@Override
	public String getAString(String name) {
		return "Welcome to Vanna"+name;
	}
	

}
