package com.moses.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moses.spring.dao.OrderDao;

@Component
public class AutowiredAtMethodService {
	private OrderDao orderDao;
	
	public AutowiredAtMethodService(@Autowired OrderDao orderDao) {
		this.orderDao = orderDao;
		System.out.println("AutowiredAtMethodService constructor...");
	}

	public OrderDao getOrderDao() {
		return orderDao;
	}

	//@Autowired 
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public String toString() {
		return "AutowiredAtMethodService [orderDao=" + orderDao + "]";
	}
	
	
}
