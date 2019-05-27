package com.moses.spring.importBean.customImpl;

import org.springframework.beans.factory.FactoryBean;

import com.moses.spring.importBean.bean.Monkey;

public class CustomFactoryBean implements FactoryBean<Monkey> {

	public Monkey getObject() throws Exception {
		return new Monkey();
	}

	public Class<?> getObjectType() {
		return Monkey.class;
	}

	public boolean isSingleton() {
		return true;
	}
}
