package com.moses.spring.designPatterns.delegate;

public class Dispatcher implements IExecutor {
	IExecutor executor;
	public Dispatcher(IExecutor executor) {
		this.executor = executor;
	}

	//项目经理，虽然也有执行方法，但工作职责不同，只分配任务
	@Override
	public void doing() {
		executor.doing();
	}

}
