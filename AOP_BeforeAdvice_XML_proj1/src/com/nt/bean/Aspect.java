//Aspect class Advice method
package com.nt.bean;

import org.aspectj.lang.JoinPoint;


public class Aspect { 
	
	//Advice method
	public void myadvice(JoinPoint jp) {
		System.out.println("Additional Concern...");
		System.out.println("Method Signature: "  + ((JoinPoint) jp).getSignature());  
	}
}
