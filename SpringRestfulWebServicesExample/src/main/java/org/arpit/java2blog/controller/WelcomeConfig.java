package org.arpit.java2blog.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WelcomeConfig {
	@Bean(name="welcome")
	public Welcome welcome() {
		return new Welcome();
	}
}
