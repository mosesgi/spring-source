package com.moses.spring.gpDesignPatterns.prototype.simple;

public class ConcretePrototype extends Prototype {
	public int age;

	public int getAge() {
		System.out.println(age);
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
