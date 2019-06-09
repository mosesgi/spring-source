package com.moses.spring.gpDesignPatterns.delegate;

public class ExecutorB implements IExecutor {

	@Override
	public void doing() {
		System.out.println("员工B开始执行任务");
	}

}
