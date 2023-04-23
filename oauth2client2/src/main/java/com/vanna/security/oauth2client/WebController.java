package com.vanna.security.oauth2client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	 	@RequestMapping("/authorization")
	    public String securedPage() {
	        return "authorization";
	    }

	    @RequestMapping("/")
	    public String index() {
	        return "index";
	    }
}
