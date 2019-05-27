package com.moses.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.moses.spring.entity.Person;

@Configuration
public class BasicAnnotationConfig {
	
	@Bean("XXXX")
	public Person person01() {
		return new Person("Moses", 38);
	}
}
