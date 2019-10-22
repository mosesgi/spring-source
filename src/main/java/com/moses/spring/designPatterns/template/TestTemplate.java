package com.moses.spring.designPatterns.template;

public class TestTemplate {
	
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		coffee.create();
		
		
		Tea tea = new Tea();
		tea.create();
	}
	
	
	//SpringJDBC使用模板模式
	//Java规范，各个数据库厂商自己实现
	//1. 加载驱动类DriverManager
	//2. 建立连接
	//3. 创建语句集（标准，预处理） -- (MySQL, Oracle, SQlServer...)
	//4. 执行语句集
	//5. 结果集ResultSet游标
	//6. ORM
}
