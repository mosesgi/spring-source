package com.moses.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import com.moses.spring.entity.Person;

@Configuration
public class LazyMainConfig {
	
	@Bean
	@Lazy
	public Person person() {
		System.out.println("Generating Person Bean into container...");
		return new Person("Moses", 38);
	}
}
