package com.moses.spring.conditionConfig;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinCondition implements Condition{
	/*
	*ConditionContext: 判断条件可以使用的上下文(环境)
	*AnnotatedTypeMetadata: 注解的信息
	*
	*/
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		Environment environment = context.getEnvironment();
		String os_name = environment.getProperty("os.name");
		if(os_name.contains("linux")){
			return true;
		}
		return false;
	}
}
