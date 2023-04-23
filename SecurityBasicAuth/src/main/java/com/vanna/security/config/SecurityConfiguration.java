package com.vanna.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
			.withUser("Saivarma").password("{noop}Saivarma@Vanna").roles("ADMIN").and()
			.withUser("Sai").password("{noop}Sai").roles("USER");
	}
	//for no authentication remove above method and change fullauthenticated to permitAll in below method
	
	@Override
	protected void configure(HttpSecurity security) throws Exception{
		security.authorizeRequests()
				//.antMatchers("/**rest**/")
				.anyRequest()
				.fullyAuthenticated()
				.and().httpBasic();
		security.csrf().disable();
	}
}
