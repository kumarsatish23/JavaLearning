package com.vanna.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.vanna.oauth"})
public class OauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthApplication.class, args);
	}

}
