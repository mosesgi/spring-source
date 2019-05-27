package com.moses.spring.lifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.moses.spring.lifeCycle.bean.AnnoMethodBean;

@Configuration
@ComponentScan("com.moses.spring.lifeCycle.bean")
public class LifeCycleMainConfig {
	@Bean(initMethod="init", destroyMethod="destroy")
	public AnnoMethodBean annoMethodBean() {
		return new AnnoMethodBean();
	}
}
