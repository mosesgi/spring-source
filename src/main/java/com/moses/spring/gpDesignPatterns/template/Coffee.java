package com.moses.spring.gpDesignPatterns.template;

public class Coffee extends Beverage {

	@Override
	protected void addIngredients() {
		System.out.println("添加牛奶和糖");
	}

	@Override
	protected void pourInCup() {
		System.out.println("将咖啡倒入杯中");
	}

}
