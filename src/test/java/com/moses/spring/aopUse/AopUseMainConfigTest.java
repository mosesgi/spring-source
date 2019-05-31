package com.moses.spring.aopUse;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopUseMainConfigTest {
	@Test
	public void test() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AopUseMainConfig.class);
		AopUseTarget bean = app.getBean(AopUseTarget.class);
		int result = bean.divide(4, 3);
		System.out.println(result);
		app.close();
	}
}
