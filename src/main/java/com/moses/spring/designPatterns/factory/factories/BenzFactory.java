package com.moses.spring.designPatterns.factory.factories;

import com.moses.spring.designPatterns.factory.Benz;
import com.moses.spring.designPatterns.factory.ICar;

public class BenzFactory implements Factory {

	@Override
	public ICar getCar() {
		return new Benz();
	}

}
