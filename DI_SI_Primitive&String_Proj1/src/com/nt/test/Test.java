package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp=(Employee)cnt.getBean("emp");
		
		System.out.println(emp); // here toString() method print
		
		System.out.println(emp.getClass());
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getPhno());
		
		((AbstractApplicationContext) cnt).close(); //warring are raise because of closing
	}

}
