package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Employee;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp=(Employee) context.getBean("emp");
		System.out.println(emp);
		emp.show();
	
		
		((AbstractApplicationContext) context).close();
	}

}
