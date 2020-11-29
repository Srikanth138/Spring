package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.Vechiles;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationConfig.xml");
		
		//((Vechiles) cnt.getBean("vcl")).show(); 
		//System.out.println(cnt.getBean("vcl"));
		System.out.println(cnt);
		
		Vechiles v=(Vechiles)cnt.getBean("vcl");
		System.out.println(v);
		v.show();
	}

}
