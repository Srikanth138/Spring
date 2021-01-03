package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.bean.PersonalInfo;

public class Test {
	public static void main(String[] args) throws Exception {
		// create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cnfg/applicationContext.xml");
		PersonalInfo ps=factory.getBean("ps",PersonalInfo.class);
		System.out.println(ps);
		
		System.out.println("-------------------------");
		PersonalInfo rajaInfo=factory.getBean("rajaInfo",PersonalInfo.class);
		System.out.println(rajaInfo);
		
		System.out.println("-------------------------");
		PersonalInfo rInfo=factory.getBean("rInfo",PersonalInfo.class);
		System.out.println(rInfo);
		
		System.out.println("-------------------------");
		PersonalInfo anilInfo=factory.getBean("anilInfo",PersonalInfo.class);
		System.out.println(anilInfo);

	}//main
}//class
