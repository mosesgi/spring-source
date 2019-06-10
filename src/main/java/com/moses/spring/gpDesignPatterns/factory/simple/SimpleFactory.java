package com.moses.spring.gpDesignPatterns.factory.simple;

import com.moses.spring.gpDesignPatterns.factory.Audi;
import com.moses.spring.gpDesignPatterns.factory.Benz;
import com.moses.spring.gpDesignPatterns.factory.Bmw;
import com.moses.spring.gpDesignPatterns.factory.ICar;

public class SimpleFactory {
	
	//实现统一管理，专业化管理。如果没有工厂模式，小作坊，没有执行标准
	public ICar getCar(String name) {
		if("BMW".equalsIgnoreCase(name)) {
			return new Bmw();
		} else if("Benz".equalsIgnoreCase(name)) {
			return new Benz();
		} else if("Audi".equalsIgnoreCase(name)) {
			return new Audi();
		} else {
			System.out.println("无此产品...");
			return null;
		}
	}
}
