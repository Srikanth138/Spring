package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.BeanMapClass;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt=new ClassPathXmlApplicationContext("applicationConfig.xml");
		BeanMapClass bmp=(BeanMapClass) cnt.getBean("bmp");
		System.out.println(bmp);
		
		bmp.shows();
	}
}
