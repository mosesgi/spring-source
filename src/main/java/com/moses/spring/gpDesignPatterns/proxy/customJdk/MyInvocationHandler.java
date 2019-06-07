package com.moses.spring.gpDesignPatterns.proxy.customJdk;

import java.lang.reflect.Method;

public interface MyInvocationHandler {
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
