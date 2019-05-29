package com.moses.spring.valueProperty;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class ValuePropertyConfigTest {
	@Test
	public void testMain() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(ValuePropertyConfig.class);
		//从容器中获取所有bean
		String[] names = app.getBeanDefinitionNames();
		
		for(String name:names){
			System.out.println(name);
		}
		ValueExample valueExample = (ValueExample) app.getBean("valueExample");

		System.out.println(valueExample);
		System.out.println("IOC容器创建完成........");
		
		
		Environment environment = app.getEnvironment();
		System.out.println("environment===="+environment.getProperty("bird.color"));
		app.close();
	}
}
