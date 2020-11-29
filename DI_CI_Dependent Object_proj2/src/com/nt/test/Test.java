package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.Employee;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationConfig.xml");
		Employee emp=(Employee)context.getBean("emp");
		System.out.println(emp);
		emp.show();

	}

}
