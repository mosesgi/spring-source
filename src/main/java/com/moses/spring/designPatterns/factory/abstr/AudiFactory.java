package com.moses.spring.designPatterns.factory.abstr;

import com.moses.spring.designPatterns.factory.Audi;
import com.moses.spring.designPatterns.factory.ICar;

public class AudiFactory extends AbstractFactory {

	@Override
	public ICar getCar() {
		return new Audi();
	}

}
