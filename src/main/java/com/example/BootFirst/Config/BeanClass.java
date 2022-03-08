package com.example.BootFirst.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.BootFirst.Model.User;

@Configuration
public class BeanClass {
  
	@Bean
	public User getUser() {
		return new User();
	}
}
