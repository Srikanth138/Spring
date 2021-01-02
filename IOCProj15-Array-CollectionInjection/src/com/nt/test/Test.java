package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.bean.College;
import com.nt.bean.CourseInfo;
import com.nt.bean.FacultyInfo;
import com.nt.bean.FruitStore;
import com.nt.bean.Student;

public class Test {
	public static void main(String[] args) throws Exception {
		// create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cnfg/applicationContext.xml");

		// get Spring bean class objects
		College clg = factory.getBean("clg", College.class);
		System.out.println("clg data is ::" + clg);
		System.out.println("----------------------------");
		
		Student stu = factory.getBean("stud", Student.class);
		System.out.println("Student data is ::" + stu);
		System.out.println("----------------------------");
		
		FacultyInfo finfo=factory.getBean("info",FacultyInfo.class);
		System.out.println("FacultyInfo data is ::" + finfo);
		System.out.println("----------------------------");
		
		FruitStore store=factory.getBean("store",FruitStore.class);
		System.out.println("FruitStore data is ::" + store);
		System.out.println("----------------------------");
		
		CourseInfo cinfo=factory.getBean("course",CourseInfo.class);
		System.out.println("FruitStore data is ::" +cinfo); //Properties are store and show in "ORDER"
	}

}
