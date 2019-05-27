package com.moses.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.moses.spring.entity.Person;

@Configuration
public class ScopeMainConfig {
	
	/*
	 * prototype:多实例: IOC容器启动的时候,IOC容器启动并不会去调用方法创建对象, 而是每次获取的时候才会调用方法创建对象
	 * singleton:单实例(默认):IOC容器启动的时候会调用方法创建对象并放到IOC容器中,以后每次获取的就是直接从容器中拿(大Map.get)的同一个bean
	 * request: 主要针对web应用, 递交一次请求创建一个实例
	 * session:同一个session创建一个实例
	 */
	@Bean
	@Scope("prototype")
	public Person person() {
		return new Person("Moses", 38);
	}
}
