package com.sophanna.app.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	@Pointcut("execution(* com.sophanna.app.*..*(..))")
	public void allMethodsPointcut() {

	}

	@Before("allMethodsPointcut()")
	public void log(JoinPoint joinPoint) {
		System.out.println("------------------- Aspeect runs by " + joinPoint.getSignature() + " ------------------- ");
	}
}
