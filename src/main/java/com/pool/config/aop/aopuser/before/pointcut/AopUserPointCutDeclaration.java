package com.pool.config.aop.aopuser.before.pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopUserPointCutDeclaration {
	@Pointcut("execution(* com.pool.service.aop.*.*(..))")
	public void aopUserPointCut() {
		System.out.println("POINT CUT EXPRESSION");
	}
	
	@Before("aopUserPointCut()")
	public void beforePointcutExpression() {
		System.out.println("BEFORE POINTCUT CALLED");
	}
	
	@Before("aopUserPointCut()")
	public void beforePointcutExpressionToSaveToSolar() {
		System.out.println("BEFORE POINTCUT CALLED-->SAVE TO SOLAR");
	}
}
