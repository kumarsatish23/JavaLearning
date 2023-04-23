package com.vanna.oauth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

//@Component
@Configuration
@EnableAuthorizationServer
public class OAuthorizationServer extends AuthorizationServerConfigurerAdapter{

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
//	@Value("${user.oauth.clientId}")
//    private String ClientID;
//    @Value("${user.oauth.clientSecret}")
//    private String ClientSecret;
////    @Value("${user.oauth.redirectUris}")
////    private String RedirectURLs;
	
	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception{
		security	
					.tokenKeyAccess("permitAll()")
					.checkTokenAccess("isAuthenticated()")
					.allowFormAuthenticationForClients();
	}
	
	@Override
	public void configure(ClientDetailsServiceConfigurer client) throws Exception{
		client
				.inMemory()
				.withClient("clientapp").secret(passwordEncoder.encode("welcometovanna"))
				.authorizedGrantTypes("authorization_code")
				.scopes("user_info")
				.redirectUris("http://localhost:9090/login/oauth2/code/")
			.and()
				.withClient("clientapp2").secret(passwordEncoder.encode("vanna"))
				.authorizedGrantTypes("authorization_code")
				.scopes("read")
				.redirectUris("http://localhost:9091/login/oauth2/code/");
	}
}
