package com.moses.spring.gpDesignPatterns.factory.factories;

import com.moses.spring.gpDesignPatterns.factory.Audi;
import com.moses.spring.gpDesignPatterns.factory.ICar;

public class AudiFactory implements Factory {

	@Override
	public ICar getCar() {
		return new Audi();
	}

}
