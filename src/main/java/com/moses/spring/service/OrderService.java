package com.moses.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.moses.spring.dao.OrderDao;

@Service
public class OrderService {

	@Qualifier("orderDao")
// @Autowired(required=false)
// 效果是一样的,与Autowired一样可以装配bean
// 1,不支持Primary功能
// 2,不支持Autowired false
// @Resource(name="orderDao2")
	@Autowired
	private OrderDao orderDao;

	public void println() {
		System.out.println(orderDao);
	}
}
