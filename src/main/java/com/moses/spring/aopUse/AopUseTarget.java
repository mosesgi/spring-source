package com.moses.spring.aopUse;

import org.springframework.stereotype.Component;

@Component
public class AopUseTarget {
	public int divide(int x, int y) {
		System.out.println("--------");
		return x/y;
	}
}
