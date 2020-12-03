package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.Bussines;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext cnt=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
		Bussines bs=(Bussines) cnt.getBean("buss");

		//System.out.println(cnt);
		bs.msg();
		System.out.println("----------------------");
		System.out.println(bs.m());
		System.out.println("----------------------");
		System.out.println(bs.k());
		
		try {
			bs.validate(20);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			bs.validate(17);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		((AbstractApplicationContext) cnt).close();
	}

}
