package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.A;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
		 
		A a=context.getBean("proxy",A.class); 
		System.out.println("proxy class name: "+a.getClass().getName());  
		System.out.println("========================================");
		a.m(); 
		System.out.println("----------------------------------------");
		a.m1();
		
		
		((AbstractApplicationContext) context).close();

	}

}
