package com.moses.spring.aopUse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*
 * 日志切面类的方法需要动态感知到div()方法运行, 
 *  通知方法:
 *     前置通知:doBefore(); 在我们执行div()除法之前运行(@Before)
 *     后置通知:doAfter();在我们目标方法div运行结束之后 ,不管有没有异常(@After)
 *     返回通知:doAfterReturning();在我们的目标方法div正常返回值后运行(@AfterReturning)
 *     异常通知:doAfterThrowing();在我们的目标方法div出现异常后运行(@AfterThrowing)
 *     环绕通知:动态代理, 需要手动执行joinPoint.procced()(其实就是执行我们的目标方法divide(), 执行之前相当于前置通知, 执行之后就相当于我们后置通知   (@Around)
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(value = "com.moses.spring.aopUse")
public class AopUseMainConfig {

}
