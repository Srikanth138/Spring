package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.Business;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
		
		Business bb=(Business) cnt.getBean("bb");
		
		bb.setSpeed(101);
		
		bb.car();
		System.out.println("..................");
		
		System.out.println(bb.engin());
		System.out.println("..................");
		
		System.out.println(bb.capacity());
		System.out.println("..................");

		
		((AbstractApplicationContext) cnt).close();

	}

}
