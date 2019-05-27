package com.moses.spring.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.moses.spring.importBean.ImportAndFactoryMainConfig;
import com.moses.spring.importBean.customImpl.CustomFactoryBean;

public class ImportAndFactoryMainConfigTest {

	@Test
	public void test1() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(ImportAndFactoryMainConfig.class);

		System.out.println("IOC容器创建完成........");

		Object bean1 = app.getBean("customFactoryBean");
		Object bean2 = app.getBean("customFactoryBean");// 取Money
		System.out.println("bean的类型=" + bean1.getClass());
		System.out.println(bean1 == bean2);
		
		Object bean3 = app.getBean("&customFactoryBean");// 取出CustomFactoryBean
		System.out.println(bean3 instanceof CustomFactoryBean);

//		String[] beanDefinitionNames = app.getBeanDefinitionNames();
//		for(String name:beanDefinitionNames){
//			System.out.println(name);
//		}
	}
}
