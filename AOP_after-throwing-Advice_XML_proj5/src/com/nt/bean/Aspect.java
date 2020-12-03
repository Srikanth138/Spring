package com.nt.bean;


import org.aspectj.lang.JoinPoint;

public class Aspect {

//Any error is raise the method will execute
	 public void myadvice(JoinPoint jp,Throwable error)//it is advice  
	    {  
	        System.out.println("additional concern");  
	        System.out.println("Method Signature: "  + jp.getSignature());  
	        System.out.println("Exception is: "+error);  
	        System.out.println("end of after throwing advice...");  
	    }  

}
