package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.Target;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
		 
		Target e=(Target) context.getBean("target");
		
		
        e.msg();
        System.out.println(".................");
        
        System.out.println( e.m());
        
        System.out.println(".................");
        System.out.println( e.k());
        
        
		((AbstractApplicationContext) context).close();

	}

}
