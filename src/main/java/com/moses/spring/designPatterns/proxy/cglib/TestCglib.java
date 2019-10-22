package com.moses.spring.designPatterns.proxy.cglib;

public class TestCglib {
	public static void main(String[] args) {
		
		//JDK的动态代理是通过接口来进行强制转换。生成以后的代理对象，可以强制转换为接口
		
		//Cglib的动态代理是通过生成一个被代理对象的子类，然后重写父类的方法。生成以后的对象，可以强制转换为被代理对象（也就是自己写的类）
		//子类引用赋值给父类
		
		Developer dev;
		try {
			dev = (Developer)new CgYellowCow().getInstance(Developer.class);
			dev.buyTicket();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
