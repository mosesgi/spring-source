package com.moses.spring.config;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.moses.spring.config.BasicAnnotationConfig;
import com.moses.spring.entity.Person;

public class BasicAnnotationConfigTest {

	@Test
	public void testApp() {
		ApplicationContext app = new AnnotationConfigApplicationContext(BasicAnnotationConfig.class);
		String[] names = app.getBeanDefinitionNames();
		for(String name : names) {
			System.out.println(name);
		}
		
		Person p = (Person)app.getBean("XXXX");
		System.out.println(p);
	}
}
