package com.moses.spring.designPatterns.factory.factories;

import com.moses.spring.designPatterns.factory.Bmw;
import com.moses.spring.designPatterns.factory.ICar;

public class BmwFactory implements Factory {

	@Override
	public ICar getCar() {
		return new Bmw();
	}

}
