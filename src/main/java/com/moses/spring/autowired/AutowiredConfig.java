package com.moses.spring.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.moses.spring.dao.OrderDao;

@Configuration
@ComponentScan({"com.moses.spring.controller", "com.moses.spring.dao", "com.moses.spring.service"})
public class AutowiredConfig {
	
	@Primary
	@Bean("orderDao2")
	public OrderDao orderDao() {
		OrderDao dao = new OrderDao();
		dao.setFlag("2");
		return dao;
	}
}
