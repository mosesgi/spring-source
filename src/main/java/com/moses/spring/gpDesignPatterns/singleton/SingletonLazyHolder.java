package com.moses.spring.gpDesignPatterns.singleton;

public class SingletonLazyHolder {
	//静态内部类，private保证全局唯一
	private static class LazyHolder{
		//final防止内部误操作
		private static final SingletonLazyHolder instance = new SingletonLazyHolder();
	}
	//私有化构造方法
	private SingletonLazyHolder() {}
	
	//提供静态方法获取实例，final保证不被覆盖
	//方法中逻辑，要用户调用时才开始执行，所需内存也是调用时才分配
	public static final SingletonLazyHolder getInstance() {
		return LazyHolder.instance;
	}
}

//类装载到JVM中过程
//从上到下（声明在前，使用在后）（不管class有没有实例化，static静态块总会在classLoader执行完以后就加载完毕 static{}） 