package com.moses.spring.lifeCycle.bean;

public class AnnoMethodBean {
	public AnnoMethodBean() {
		System.out.println("AnnoMethodBean constructor");
	}
	
	public void init() {
		System.out.println("AnnoMethodBean init...");
	}
	
	public void destroy() {
		System.out.println("BeanAnnoMethods destroy...");
	}
}
