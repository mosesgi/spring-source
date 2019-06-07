package com.moses.spring.gpDesignPatterns.factory.simple;

import com.moses.spring.gpDesignPatterns.factory.ICar;

public class SimpleFactoryTest {
	public static void main(String[] args) {
		//消费者
		ICar car = new SimpleFactory().getCar("Audi");
		System.out.println(car.getName());
	}
}
