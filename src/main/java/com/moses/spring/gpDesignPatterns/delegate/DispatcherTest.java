package com.moses.spring.gpDesignPatterns.delegate;

public class DispatcherTest {
	public static void main(String[] args) {
		Dispatcher disp = new Dispatcher(new ExecutorA());
		//看上去干活的是项目经理。但实际上是员工。"干活是我的，功劳是你的"
		disp.doing();
	}
}
