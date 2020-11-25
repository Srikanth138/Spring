package com.company.test;

import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.company.beans.Welcome;

public class BasicTest {

	public static void main(String[] args) {
		
		//here we can write fully calified name
		FileSystemResource res=new FileSystemResource("src/com/company/cnfg/applicationcontext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		Date d=(Date)factory.getBean("dt");
		System.out.println("date ::"+d);
		Welcome wc=(Welcome)factory.getBean("wlc");
		//wc is Welcome class object 
		System.out.println(wc.getBean("Srikanth"));

	}

}
