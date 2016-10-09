package com.yingjun.ssm.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author yingjun
 *
 * 采用AOP的方式处理参数问题。
 */
@Component
@Aspect
public class CopyOfBindingResultAopNew_2 {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(* com.yingjun.ssm.web.*.*(..))")
    public void aopMethod(){}

    @After("aopMethod()")
    public void beforeSleep(){
    	LOG.info("**************after method end************!");
    }
}
