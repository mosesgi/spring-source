package com.moses.spring.gpDesignPatterns.factory.abstr;

import com.moses.spring.gpDesignPatterns.factory.Audi;
import com.moses.spring.gpDesignPatterns.factory.ICar;

public class AudiFactory extends AbstractFactory {

	@Override
	public ICar getCar() {
		return new Audi();
	}

}
