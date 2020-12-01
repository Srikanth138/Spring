package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.bean.SetterClass;

public class Test {

	public static void main(String[] args) {
		FileSystemResource res=new FileSystemResource("src/com/nt/cnfg/applicationContext.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(res);
		
		SetterClass sc=factory.getBean("sc",SetterClass.class);
		System.out.println(sc.show("Srikanth"));
		System.out.println("Find The Class ::"+sc.getClass().getName());
		
	}

}
