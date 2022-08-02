
  package com.example.demo;
  
  import org.springframework.boot.autoconfigure.EnableAutoConfiguration; 
  import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder; 
  import org.springframework.security.config.annotation.web.builders.HttpSecurity;
  import  org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration. WebSecurityConfigurerAdapter; 
  import org.springframework.security.crypto.factory.PasswordEncoderFactories; 
  import org.springframework.security.crypto.password.NoOpPasswordEncoder; 
  import org.springframework.security.crypto.password.PasswordEncoder;
  
  @SuppressWarnings("deprecation")
  @Configuration
  @EnableWebSecurity
  //@EnableAutoConfiguration 
  public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication() .withUser("Mahesh").password("Mahesh@123").roles("SALESPERSON")
		  .and()
		  .withUser("Kanika").password("Kanika@123").roles("Clerk"); 
		}
		
	 @Bean
	  PasswordEncoder getPasswordEncoder() { 
		  return   NoOpPasswordEncoder.getInstance(); 
	  
	  }
	  
  
  
  }
  
  
  
  
 