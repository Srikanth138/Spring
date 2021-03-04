package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cnfg.AppConfig;
import com.nt.comps.Vehicle;

public class Test {

	public static void main(String[] args) {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Vehicle vc=ctx.getBean("vehicle",Vehicle.class);
		System.out.println("--------------");
		vc.journey("src","des");
	}

}
