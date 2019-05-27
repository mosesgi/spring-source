package com.moses.spring.config;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.moses.spring.config.CompScanFilterMainConfig;

public class CompScanFilterConfigTest {
	@Test
	public void testApp() {
		ApplicationContext app = new AnnotationConfigApplicationContext(CompScanFilterMainConfig.class);
		String[] names = app.getBeanDefinitionNames();
		for(String name : names) {
			System.out.println(name);
		}
		
	}
}
