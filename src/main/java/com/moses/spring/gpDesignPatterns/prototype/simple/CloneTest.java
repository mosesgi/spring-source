package com.moses.spring.gpDesignPatterns.prototype.simple;

public class CloneTest {
	public static void main(String[] args) {
		ConcretePrototype cp = new ConcretePrototype();
		cp.setAge(18);
		ConcretePrototype copy;
		try {
			copy = (ConcretePrototype)cp.clone();
			copy.getAge();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
