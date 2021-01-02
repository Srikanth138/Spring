package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.bean.SimpleBean;

public class Test {
	public static void main(String[] args) {
		// create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cnfg/applicationContext.xml");
		// get Spring bean class objects
		SimpleBean bean = factory.getBean("com.nt.bean.SimpleBean#0", SimpleBean.class);
		System.out.println("bean1 data::" + bean);
		
		SimpleBean bean1 = factory.getBean("com.nt.bean.SimpleBean#1", SimpleBean.class);
		System.out.println("bean1 data::" + bean1);
		
		SimpleBean bean2 = factory.getBean("com.nt.bean.SimpleBean#2", SimpleBean.class);
		System.out.println("bean1 data::" + bean2);
		
		System.out.println("-------------------------------------");
		Date d=factory.getBean("java.util.Date",Date.class);
		System.out.println("d1 obj data::"+d);
		
		Date d2=factory.getBean("java.util.Date#0",Date.class);
		System.out.println("d2 obj data::"+d2);
		
		Date d3=factory.getBean("java.util.Date#1",Date.class);
		System.out.println("d3 obj data::"+d3);
	}

}
