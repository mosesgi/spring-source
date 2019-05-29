package com.moses.spring.autowired;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.moses.spring.dao.OrderDao;
import com.moses.spring.service.OrderService;

public class AutowiredConfigTest {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AutowiredConfig.class);
		
		OrderService orderService = app.getBean(OrderService.class);
		orderService.println();
		//直接从容器中获取TestDao, 和使用Autowired注解来取比较
		OrderDao orderDao = app.getBean(OrderDao.class);
		System.out.println(orderDao);
		
		app.close();
	}
}
