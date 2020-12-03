package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.Business;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
		
		Business bb=(Business) cnt.getBean("bb");
		try {
			bb.validate(19);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------------------");
		try {
			bb.validate(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
		((AbstractApplicationContext) cnt).close();

	}

}
