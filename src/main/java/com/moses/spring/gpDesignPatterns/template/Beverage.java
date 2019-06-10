package com.moses.spring.gpDesignPatterns.template;


public abstract class Beverage {
	
	//流程不能被重写
	public final void create() {
		//1.烧开水
		boilWater();
		//2.杯子准备好，原材料放到杯子中
		pourInCup();
		//3.用水冲泡
		brew();
		//4.加辅料
		addIngredients();
	}

	protected abstract void addIngredients();

	private void brew() {
		System.out.println("将开水倒入杯中");
	}

	protected abstract void pourInCup();

	private void boilWater() {
		System.out.println("烧开水，100度");
	}
}
