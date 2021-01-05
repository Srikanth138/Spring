package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Beans.Bean;
import com.nt.service.Service;

public class Test{
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
		
		Service ser=ctx.getBean("serviceAlias",Service.class);//mention the Alias Name here(OR)Calling
		System.out.println("Service "+ser+"-> "+ser.getClass());
		
		Bean bean=ctx.getBean("beanAlias",Bean.class);//mention the Alias Name here(OR)Calling
		System.out.println("Bean "+bean+"-> "+bean.getClass());
	}// main
}// class
