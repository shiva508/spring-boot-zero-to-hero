package com.pool.config.aop.aopuser.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopUserAround {
	@Around("execution(* com.pool.service.aop.AopUserServiceImpl.getAllAopUsers(..))")
	public Object aopUserAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		Long startTime=System.currentTimeMillis();
		Object processedData=proceedingJoinPoint.proceed();
		Long endTime=System.currentTimeMillis();
		System.out.println("endTime:"+endTime+"-startTime:"+startTime);
		return processedData;
	}
}
