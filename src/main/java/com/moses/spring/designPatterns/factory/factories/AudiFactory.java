package com.moses.spring.designPatterns.factory.factories;

import com.moses.spring.designPatterns.factory.Audi;
import com.moses.spring.designPatterns.factory.ICar;

public class AudiFactory implements Factory {

	@Override
	public ICar getCar() {
		return new Audi();
	}

}
