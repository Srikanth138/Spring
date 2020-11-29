package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.Question;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationConfig.xml");
		Question q=(Question)cnt.getBean("qes");
		System.out.println(q);

	}

}
