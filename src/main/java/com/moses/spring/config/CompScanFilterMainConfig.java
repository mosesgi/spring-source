package com.moses.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;

import com.moses.spring.entity.Person;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(value = "com.moses.spring", includeFilters= {
//		@Filter(type=FilterType.ANNOTATION,classes = Controller.class ),
		@Filter(type=FilterType.CUSTOM, classes = CompScanCustomFilter.class)
},useDefaultFilters = false)
public class CompScanFilterMainConfig {
	@Bean
	public Person person() {
		return new Person("Moses", 38);
	}
}
