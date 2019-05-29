package com.moses.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.moses.spring.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
}
