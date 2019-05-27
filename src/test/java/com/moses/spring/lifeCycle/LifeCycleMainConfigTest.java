package com.moses.spring.lifeCycle;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleMainConfigTest {
	
	@Test
	public void testMain() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(LifeCycleMainConfig.class);
		System.out.println("IOC容器创建完成...");
		
		app.close();
	}
}
