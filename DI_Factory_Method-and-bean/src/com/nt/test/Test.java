package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.A;

public class Test {

	public static void main(String[] args) {
		/*
		 * Resource res=new ClassPathResource("com/nt/cnfg/applicationContext.xml");
		 * BeanFactory factory=new XmlBeanFactory(res);
		 */
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
//	A a=(A)factory.getBean("a");
	
//	A aa=(A)factory.getBean("aa");
	
//	A ba=(A)factory.getBean("ba");
	
	A ab=(A)factory.getBean("ab");
	System.out.println(ab.toString());
	((AbstractApplicationContext) factory).close();
	}
}
