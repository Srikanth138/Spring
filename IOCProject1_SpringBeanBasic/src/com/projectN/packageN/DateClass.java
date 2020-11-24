package com.projectN.packageN;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DateClass {
	//IOC -> Inversion of Control
	
	public static void main(String args[]){
		/*
		FileSystemResource res=new FileSystemResource("applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);*/
				
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		
		Date d=(Date)factory.getBean("date");
		System.out.println("TODAYS DATE ::"+d);
	}
	
}
