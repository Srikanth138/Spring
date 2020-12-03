package com.nt.bean;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Aspect {

	public Object advice(ProceedingJoinPoint pjp) throws Throwable { //ProceedingJoinPoint -> class ->create the object and refer the .proceed()
		
		System.out.println("additional concern staring part-1"); 
		System.out.println(pjp);
		
		Object obj=pjp.proceed();
		
        System.out.println(obj+"......");
		System.out.println("end of after returning advice...Ending part-2");  
		
		return obj;
	}

}
