package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.Vehicle;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
		Vehicle vc=cnt.getBean("vehicle",Vehicle.class);
		System.out.println("--------------");
		vc.journey("src","des");
	}

}
