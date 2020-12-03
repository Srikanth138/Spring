package com.nt.bean;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectClass {
	
//	@Pointcut("execution(int Bussines.*(..))")  
//    public void mmm(){//pointcut name 
//		System.out.println("AspectClass.k()");
//	} 
	
	/*
	 * @After("mmm()") 
	 * //@Before("mmm()") 
	 * //applying pointcut on before advice
	 * public void myadvice(JoinPoint jp) //it is advice (before advice) 
	 * {
	 * System.out.println("additional concern");
	 * System.out.println("Method Signature: " + jp.getSignature()); 
	 * }
	 */
	
	//AfterReturning
//	@AfterReturning(pointcut = "execution(int Bussines.*(..))",returning= "result")             
//	public void myadvice(JoinPoint jp,Object result)//it is advice (after returning advice)  
//	{  
//      System.out.println("additional concern");  
//      System.out.println("Method Signature: "  + jp.getSignature());  
//      System.out.println("Result in advice: "+result);  
//      System.out.println("end of after returning advice...");  
//   } 
	
	//around Advice
	@Pointcut("execution(void Bussines.*(..))")  
    public void abcPointcut(){}
	
//	@Around("abcPointcut()")  
//    public Object myadvice(ProceedingJoinPoint pjp) throws Throwable   
//    {  
//        System.out.println("Additional Concern Before calling actual method");  
//        Object obj=pjp.proceed();  
//        System.out.println("Additional Concern After calling actual method");  
//        return obj;  
//    }  
	
	//AfterThrowing
	@AfterThrowing(pointcut = "execution(void Bussines.*(..))",throwing= "error")           
	public void myadvice(JoinPoint jp,Throwable error)//it is advice  
	{  
      System.out.println("additional concern");  
      System.out.println("Method Signature: "  + jp.getSignature());  
      System.out.println("Exception is: "+error);  
      System.out.println("end of after throwing advice...");  
	}  

}
