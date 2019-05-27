package com.moses.spring;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.moses.spring.conditionConfig.ConditionMainConfig;

public class ConditionMainConfigTest {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(ConditionMainConfig.class);
		System.out.println("IOC容器创建完成........");
	}
}
