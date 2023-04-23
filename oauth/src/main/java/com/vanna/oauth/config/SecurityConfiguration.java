package com.vanna.oauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@Order(1)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{


	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
			.withUser("Saivarma").password(passwordEncoder().encode("{noop}Sai")).roles("USER");
	}
	
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.requestMatchers()
          .antMatchers("/login", "/oauth/authorize")
          .and()
          .authorizeRequests()
          .anyRequest().authenticated()
          .and()
          .formLogin().permitAll();
    }
	
   @Bean
   public BCryptPasswordEncoder passwordEncoder(){
       return new BCryptPasswordEncoder();
   }
}
