package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.Printer;
import com.nt.service.ServiceClass;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");

		/*
		 * ServiceClass obj = (ServiceClass) ctx.getBean("obj1");
		 * obj.wishLogic("Srikanth");
		 */
		 Printer obj=ctx.getBean("obj1",Printer.class);
		 

//		ServiceClass obj1 = ctx.getBean("obj1", ServiceClass.class);
//		obj1.wishLogic("Patel");
		 Printer obj1=ctx.getBean("obj2",Printer.class);

		System.out.println(obj.hashCode() + " " + obj1.hashCode() + " ? " + obj.equals(obj1));

		System.out.println("-----------------------------------------");

		ServiceClass obj2 = ctx.getBean("obj2", ServiceClass.class);
		obj2.wishLogic("hai");

		System.out.println(obj1.hashCode() + " " + obj2.hashCode() + " ? " + obj1.equals(obj2));

		((AbstractApplicationContext) ctx).close();

	}

}
