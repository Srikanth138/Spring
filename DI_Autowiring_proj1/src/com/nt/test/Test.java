package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Engine;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
		Engine e=(Engine) context.getBean("eng");
		
		System.out.println(e);
		e.show();
		((AbstractApplicationContext) context).close();
	}

}
