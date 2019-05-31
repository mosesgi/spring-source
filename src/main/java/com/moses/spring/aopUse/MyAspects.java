package com.moses.spring.aopUse;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspects {
	@Pointcut("execution(public int com.moses.spring.aopUse.AopUseTarget.*(..))")
	public void pointCut() {}
	
	@Before("pointCut()")
	public void doBefore() {
		System.out.println("除法运行....参数列表是:{}");
	}
	
	@After("pointCut()")
	public void doAfter() {
		System.out.println("除法结束......");
	}
	
	@AfterReturning("pointCut()")
	public void doAfterReturning() {
		System.out.println("除法正常返回......运行结果是:{}");
	}
	
	@AfterThrowing("pointCut()")
	public void doAfterThrowing() {
		System.out.println("运行异常......异常信息是:{}");
	}
	
	@Around("pointCut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("@Around: before executing method");
		Object result = pjp.proceed();
		System.out.println("@Around: After axecuting method");
		return result;
	}
}
