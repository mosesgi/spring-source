package com.moses.spring.gpDesignPatterns.factory.abstr;

import com.moses.spring.gpDesignPatterns.factory.ICar;

public abstract class AbstractFactory {
	
	protected abstract ICar getCar();
	
	public ICar getCar(String name) {
		if("BMW".equalsIgnoreCase(name)) {
			return new BmwFactory().getCar();
		} else if("Benz".equalsIgnoreCase(name)) {
			return new BenzFactory().getCar();
		} else if("Audi".equalsIgnoreCase(name)) {
			return new AudiFactory().getCar();
		} else {
			System.out.println("无此产品...");
			return null;
		}
	}
}
