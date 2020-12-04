package com.nt.bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor{
	
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		
		System.out.println("befor....");
		Object obj=mi.proceed();
		System.out.println("after....");
		return obj;
	}

}
