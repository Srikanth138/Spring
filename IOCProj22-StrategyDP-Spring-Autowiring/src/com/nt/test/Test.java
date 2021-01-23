package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Vehicle;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cnfg/ApplicationContext.xml");
		Vehicle ie=ctx.getBean("vehicle",Vehicle.class);
		
		System.out.println(ie);
		ie.journey("hyd", "goa");
		
		((AbstractApplicationContext) ctx).close();

	}

}
