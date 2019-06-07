package com.moses.spring.gpDesignPatterns.factory.factories;

import com.moses.spring.gpDesignPatterns.factory.Benz;
import com.moses.spring.gpDesignPatterns.factory.ICar;

public class BenzFactory implements Factory {

	@Override
	public ICar getCar() {
		return new Benz();
	}

}
