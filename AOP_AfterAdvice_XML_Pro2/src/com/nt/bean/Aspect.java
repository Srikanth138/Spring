package com.nt.bean;

import org.aspectj.lang.JoinPoint;

public class Aspect {
	public void advice(JoinPoint jp) {
		System.out.println("Aspect.advice() ");
		System.out.println("this information is the cars...");
		System.out.println("...."+jp.getClass());
		
	}

}
