package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.ByName;
import com.nt.comps.ByType;
import com.nt.comps.IndexBased;


public class Test {

	public static void main(String[] args) throws Exception{
		ApplicationContext cnt=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
		IndexBased ib=cnt.getBean("ib",IndexBased.class);
		System.out.println("Index Based ::"+ib);
		
		System.out.println("--------------");
		ByType bt=cnt.getBean("bt",ByType.class);
		System.out.println("ByType ::"+bt);
		
		System.out.println("--------------");
		ByName bn=cnt.getBean("bn",ByName.class);
		System.out.println("ByName ::"+bn);
		
		((AbstractApplicationContext) cnt).close();
	}

}
