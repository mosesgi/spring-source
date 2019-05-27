package com.moses.spring.conditionConfig;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WinCondition implements Condition{
	
	/**
	 * ConditionContext: 判断条件可以使用的上下文(环境)
	 * AnnotatedTypeMetadata: 注解的信息
	 *
	 */
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata arg1) {
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		Environment env = context.getEnvironment();
		String osName = env.getProperty("os.name");
		System.out.println(osName);
		if(osName.contains("Windows")) {
			return true;
		}
		return false;
	}

}
