package com.moses.spring.designPatterns.factory.abstr;

import com.moses.spring.designPatterns.factory.ICar;

public class DefaultFactory extends AbstractFactory {
	private AudiFactory defaultFactory = new AudiFactory();
	
	@Override
	public ICar getCar() {
		return defaultFactory.getCar();
	}
	
	

}
