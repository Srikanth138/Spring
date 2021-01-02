package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.service.B;

public class Test {

	public static void main(String[] args) {
		//unresolvable circular reference? -> constructor circular injection is not possible
		
		
				//create IOC container
				DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
				//create XmlBeanDefinitationReader
				XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
				//load spring bean cfg file
				reader.loadBeanDefinitions("com/nt/cnfg/applicationContext.xml");
				
				//get Bean obj
				/*A  a=factory.getBean("a1",A.class);
				System.out.println(a);*/
				
				B  b=factory.getBean("b1",B.class);
				System.out.println(b);

	}

}