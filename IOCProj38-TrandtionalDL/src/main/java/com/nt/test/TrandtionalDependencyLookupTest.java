package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class TrandtionalDependencyLookupTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nt/cfgs/applicationContext.xml");
		System.out.println("..................");
		// get Target Bean class object
		Cricketer cricketer = ctx.getBean("cricketer", Cricketer.class);
		System.out.println("..................");
		// invoke the methods
		
		cricketer.bowling();
		System.out.println("..................");
		cricketer.fielding();
		System.out.println("..................");
		
		cricketer.batting();
		System.out.println("..................");

		// close container
		((AbstractApplicationContext) ctx).close();

	}

}
