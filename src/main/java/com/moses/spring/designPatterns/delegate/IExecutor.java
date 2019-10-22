package com.moses.spring.designPatterns.delegate;

public interface IExecutor {
	
	//普通员工执行任务
	//为什么有接口：比如在公司中员工执行任务有相关规定和要求
	void doing();
}
