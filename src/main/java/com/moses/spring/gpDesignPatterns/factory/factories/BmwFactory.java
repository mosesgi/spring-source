package com.moses.spring.gpDesignPatterns.factory.factories;

import com.moses.spring.gpDesignPatterns.factory.Bmw;
import com.moses.spring.gpDesignPatterns.factory.ICar;

public class BmwFactory implements Factory {

	@Override
	public ICar getCar() {
		return new Bmw();
	}

}
