package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.Employee;



public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt=new ClassPathXmlApplicationContext("applicationConfig.xml");
		
		
		Employee emp1=(Employee) cnt.getBean("emp1");
		System.out.println("3-param constractor ::"+emp1);
		emp1.show();
		
		System.out.println( );
		
		Employee emp2=(Employee) cnt.getBean("emp2");
		System.out.println("Address Constractor ::"+emp2);
		emp2.show();
	}
}
