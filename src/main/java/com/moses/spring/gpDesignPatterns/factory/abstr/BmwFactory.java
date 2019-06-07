package com.moses.spring.gpDesignPatterns.factory.abstr;

import com.moses.spring.gpDesignPatterns.factory.Bmw;
import com.moses.spring.gpDesignPatterns.factory.ICar;

public class BmwFactory extends AbstractFactory {

	@Override
	public ICar getCar() {
		return new Bmw();
	}

}
