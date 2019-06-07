package com.moses.spring.gpDesignPatterns.factory.abstr;

import com.moses.spring.gpDesignPatterns.factory.Benz;
import com.moses.spring.gpDesignPatterns.factory.ICar;

public class BenzFactory extends AbstractFactory {

	@Override
	public ICar getCar() {
		return new Benz();
	}

}
