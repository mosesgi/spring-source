package com.moses.spring.designPatterns.factory.factories;

import com.moses.spring.designPatterns.factory.ICar;

//工厂接口，就定义了所有工厂的执行标准׼
public interface Factory {

	ICar getCar();
	
}
