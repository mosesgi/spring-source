package com.moses.spring.autowired;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moses.spring.dao.OrderDao;
import com.moses.spring.service.OrderService;


public class AutowiredConfigTest {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AutowiredConfig.class);
		
		OrderService orderService = app.getBean(OrderService.class);
		orderService.println();
		//直接从容器中获取TestDao, 和使用Autowired注解来取比较
		OrderDao orderDao = (OrderDao)app.getBean("orderDao");
		System.out.println(orderDao);
		
//		ClassPathXmlApplicationContext
		
		app.close();
	}
	
	@Test
	public void testMethodLevelAutowired() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AutowiredConfig.class);
		OrderDao orderDao = (OrderDao)app.getBean("orderDao");
		System.out.println(orderDao);
		
		AutowiredAtMethodService s1 = (AutowiredAtMethodService)app.getBean(AutowiredAtMethodService.class);
		System.out.println(s1.getOrderDao());
	}
	
	@Test
	public void testAwareInterfaces() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AutowiredConfig.class);
		System.out.println("IOC context from test: " + app);
	}
}
