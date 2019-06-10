package com.moses.spring.gpDesignPatterns.factory.abstr;

import com.moses.spring.gpDesignPatterns.factory.ICar;

public class DefaultFactory extends AbstractFactory {
	private AudiFactory defaultFactory = new AudiFactory();
	
	@Override
	public ICar getCar() {
		return defaultFactory.getCar();
	}
	
	

}
