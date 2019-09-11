package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SpringSecurityConfigurasion extends WebSecurityConfigurerAdapter{
	@Override
 	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
 		auth
 		// enable in memory based authentication with a user named "user" and "admin"
 		.inMemoryAuthentication()
 		.withUser("user")
 		.password("password")
 		.roles("USER")
 		.and()
 		.withUser("admin")
 		.password("password")
 		.roles("ADMIN");
 	}
	
	@Override
 	protected void configure(HttpSecurity http) throws Exception {
 		http.authorizeRequests()
 		.antMatchers("/admin").hasRole("ADMIN")
 		.antMatchers("/user").hasAnyRole("ADMIN","USER")
 		.antMatchers("/").permitAll()
 		.and()
 		.formLogin();
 		
 		
 		//.antMatchers("/").permitAll() //this url can access by all user whether they loged in or not. You can add more url pattern in same
 		//.antMatchers("/user")
 		//.hasRole("USER").and()
 				// Possibly more configuration ...
 		//.formLogin(); // enable form based log in
 				// set permitAll for all URLs associated with Form Login
 				//.permitAll();
 	}

	
	@Bean
	public PasswordEncoder getPassWordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
}
