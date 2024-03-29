package com.slokam.oauth.RestSec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


	
	  @Override protected void configure(AuthenticationManagerBuilder auth) throws
	  Exception { 
		
	
		
			
			 auth.inMemoryAuthentication().withUser("a")
			 .password("{noop}p").roles("admin");
			 
		  
		
	  
	  }
	 
	@Bean
	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		
		System.out.println("oneeeeeeeeeeeeeeeeeeeeeee=====5");
		return super.authenticationManager();
		
		
	}
	
	/*
	 * @Bean public PasswordEncoder passwordEncoder(){ PasswordEncoder encoder = new
	 * BCryptPasswordEncoder(); return encoder; }
	 */
}
