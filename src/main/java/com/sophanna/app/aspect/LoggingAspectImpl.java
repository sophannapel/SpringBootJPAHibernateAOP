package com.sophanna.app.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class LoggingAspectImpl implements LoggingAspect {

	@Pointcut("execution(public * *(..))")
	public void allMethodsPointcut() {

	}

	@Before("allMethodsPointcut()")
	public void log() {
		System.out.println("Logging aspect is running");
	}
}
