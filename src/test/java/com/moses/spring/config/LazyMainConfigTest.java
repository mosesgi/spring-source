package com.moses.spring.config;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.moses.spring.entity.Person;

public class LazyMainConfigTest {
	@Test
	public void testApp() {
		ApplicationContext app = new AnnotationConfigApplicationContext(LazyMainConfig.class);
		System.out.println("IOC Container initialization complete.");
		Person p1 = (Person)app.getBean("person");
	}
}
