package com.moses.spring.gpDesignPatterns.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CgYellowCow implements MethodInterceptor{
	//没有持有被代理对象的引用？？
	//子类，已包含父类信息
	public Object getInstance(Class clazz) throws Exception{
		//通过反射机制，实现实例化
		Enhancer enhancer = new Enhancer();
		//设置父类，告诉CGLib生成的子类需要继承哪个类
		enhancer.setSuperclass(clazz);
		//设置回调
		enhancer.setCallback(this);
		//第一步，生成源代码；第二步，编译成class文件；第三步，加载到JVM中，并返回被代理对象
		return enhancer.create();
	}
	
	//同样做的是字节码重组这样一件事
	//对于使用API的用户来说，是无感知的
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("我是CGlib黄牛，要给你买票..");
		System.out.println("====================");
		//这个obj的引用是由CGLib给我们new出来的, new出来以后的对象，是被代理对象的子类（继承了自己写的类）
		//OOP: 在new子类之前，实际上默认调用了super()方法的，new了子类的同时也必须先new出父类，这就是相当于间接的持有了父类的引用
		//子类重写了父类的所有方法，我们改变子类对象的某些属性，是可以间接的操作到父类的属性的
		proxy.invokeSuper(obj, args);	//必须是Super，否则会死循环
		System.out.println("====================");
		System.out.println("应该买得到");
		return null;
	}
	
}
