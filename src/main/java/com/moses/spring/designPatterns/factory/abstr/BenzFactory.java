package com.moses.spring.designPatterns.factory.abstr;

import com.moses.spring.designPatterns.factory.Benz;
import com.moses.spring.designPatterns.factory.ICar;

public class BenzFactory extends AbstractFactory {

	@Override
	public ICar getCar() {
		return new Benz();
	}

}
