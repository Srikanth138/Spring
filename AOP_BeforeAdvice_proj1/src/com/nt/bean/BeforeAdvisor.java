package com.nt.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

			 //org.springframework.aop.MethodBeforeAdvice
public class BeforeAdvisor implements 
  										MethodBeforeAdvice  
  										//AfterReturningAdvice 
{ 
	
	 //****MethodBeforeAdvice
	//java.lang.reflect.Method
	public void before(Method method, Object[] args, Object target)throws Throwable {  
		
        System.out.println("additional concern before actual logic");  
		
//		  System.out.println("method info:"+method.getName()+" "+method.getModifiers());
//		  System.out.println("argument info:"); 
//		  for(Object arg:args)
//		  System.out.println(arg); 
//		  System.out.println("target Object:"+target);
//		  System.out.println("target object class name: "+target.getClass().getName());
//		 
	}
	
	//AfterReturningAdvice
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("additional concern After actual logic");
		
	}

}
