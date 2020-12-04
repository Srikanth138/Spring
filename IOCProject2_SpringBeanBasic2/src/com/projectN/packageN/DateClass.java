package com.projectN.packageN;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.Aclass;

public class DateClass {
	
	public static void main(String args[]){
		
		ApplicationContext cnt=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Date d=(Date) cnt.getBean("date");
		Aclass dd=(Aclass)cnt.getBean("dt");
		
		System.out.println("USER Define DATE ::"+d);
		
		System.out.println("   ");
		
		System.out.println("class properties ::"+dd);
		
		
		((AbstractApplicationContext) cnt).close();
	}
	
}