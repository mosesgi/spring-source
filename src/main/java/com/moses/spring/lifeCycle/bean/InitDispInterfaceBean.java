package com.moses.spring.lifeCycle.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class InitDispInterfaceBean implements InitializingBean, DisposableBean{
	
	public InitDispInterfaceBean() {
		System.out.println("InitDispInterfaceBean constructor...");
	}

	public void destroy() throws Exception {
		System.out.println("InitDispInterfaceBean destroy...");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("InitDispInterfaceBean afterPropertiesSet()...");
	}

}
