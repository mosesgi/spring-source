package com.moses.spring.gpDesignPatterns.proxy.jdk;

public class Student implements Person {

	@Override
	public void buyTicket() {
		System.out.println("Student - I want to buy ticket!!");
	}

}
