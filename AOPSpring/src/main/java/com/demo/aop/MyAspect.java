package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Before("execution(* com.demo.beans.*.*(..))")
	public void beforAdvice()
	{
		System.out.println("in before Advice");
	}
	
	@After("execution(* com.demo.beans.*.*(..))")
	public void afterAdvice()
	{
		System.out.println("in after advice");
	}
	
	@AfterThrowing("execution(* com.demo.beans.*.*(..))")
	public void afterThrowingAdvice()
	{
		System.out.println("in afterThrowingAdvice advice");
	}
	
	@AfterReturning("execution(* com.demo.beans.*.*(..))")
	public void afterReturning()
	{
		System.out.println("in afterReturning advice");
	}
	
	@Around("execution(* com.demo.beans.*.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinpoint) throws Throwable
	{
		System.out.println("In aroundAdvice before function call");
		Object obj = joinpoint.proceed();
		System.out.println("In aroundAdvice after function call");
		return obj;
	}

}
