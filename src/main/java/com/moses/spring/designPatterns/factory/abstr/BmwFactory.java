package com.moses.spring.designPatterns.factory.abstr;

import com.moses.spring.designPatterns.factory.Bmw;
import com.moses.spring.designPatterns.factory.ICar;

public class BmwFactory extends AbstractFactory {

	@Override
	public ICar getCar() {
		return new Bmw();
	}

}
