package com.moses.spring.designPatterns.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class YellowCow implements InvocationHandler{
	private Person person;		//被代理对象信息被保存
	
	public Object getInstance(Person person) throws Exception{
		this.person = person;
		Class clazz = person.getClass();
		System.out.println("被代理对象的class是:" + clazz);
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("我是黄牛，要给你买票..");
		System.out.println("====================");
		
		//调用的时候
		method.invoke(this.person, args);
		System.out.println("====================");
		System.out.println("应该买得到");
		return null;
	}

}
