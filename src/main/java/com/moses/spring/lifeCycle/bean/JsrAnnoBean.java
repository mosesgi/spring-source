package com.moses.spring.lifeCycle.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;


@Component
public class JsrAnnoBean {
	
	public JsrAnnoBean() {
		System.out.println("JsrAnnoBean constructor...");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("JsrAnnoBean init...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("JsrAnnoBean destroy...");
	}
}
