package com.moses.spring.designPatterns.template;

public class Tea extends Beverage {

	@Override
	protected void addIngredients() {
		System.out.println("添加蜂蜜");
	}

	@Override
	protected void pourInCup() {
		System.out.println("加入茶叶");
	}

}
