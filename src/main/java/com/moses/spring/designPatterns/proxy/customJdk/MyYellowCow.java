package com.moses.spring.designPatterns.proxy.customJdk;

import java.lang.reflect.Method;

import com.moses.spring.designPatterns.proxy.jdk.Person;

public class MyYellowCow implements MyInvocationHandler{
	private Person target;
	
	public Object getInstance(Person target) throws Exception{
		this.target = target;
		Class clazz = target.getClass();
		System.out.println("被代理对象的class是:" + clazz);
		return MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("我是黄牛，要给你买票..");
		System.out.println("====================");
		method.invoke(this.target, args);
		System.out.println("====================");
		System.out.println("应该买得到");
		return null;
	}

}
