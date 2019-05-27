package com.moses.spring.config;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.moses.spring.entity.Person;

public class ScopeMainConfigTest {
	@Test
	public void testApp() {
		ApplicationContext app = new AnnotationConfigApplicationContext(ScopeMainConfig.class);
		
		Person p1 = (Person)app.getBean("person");
		Person p2 = (Person)app.getBean("person");
		System.out.println(p1 == p2);
	}
}
