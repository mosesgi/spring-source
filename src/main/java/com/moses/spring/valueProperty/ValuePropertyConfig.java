package com.moses.spring.valueProperty;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:test.properties")
public class ValuePropertyConfig {

	@Bean
	public ValueExample valueExample() {
		return new ValueExample();
	}
}
