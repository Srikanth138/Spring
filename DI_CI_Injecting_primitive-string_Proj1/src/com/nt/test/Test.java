package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.main.Employee;

public class Test {

	public static void main(String[] args) {
		
//		FileSystemResource res=new FileSystemResource("src/com/nt/cfg/applicationContext.xml"); //src full-path is mandetory
		
		Resource res=new ClassPathResource("com/nt/cfg/applicationContext.xml"); //only package and class
		BeanFactory factory=new XmlBeanFactory(res);	
		Employee emp=(Employee)factory.getBean("emp");
		
		//ApplicationContext cnt=new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");  //only package and class
		//Employee emp=(Employee)cnt.getBean("emp");
		emp.show();
	}

}
