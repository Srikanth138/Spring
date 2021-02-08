package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoteElgibilityChecking;

public class Test {
	public static void main(String args[]) {
		
		//create IOC container
				ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
				//get Spring bean class obj
				VoteElgibilityChecking  checking=ctx.getBean("voting",VoteElgibilityChecking.class);
				//invoke methods
				System.out.println(checking.checkElgibility());
				//close container
				((AbstractApplicationContext) ctx).close(); 
				
				System.out.println("--------------------------------------------");
//				//create IOC container
//				DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
//				XmlBeanDefinitionReader  reader=new XmlBeanDefinitionReader(factory);
//				reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
//				//get Spring bean class obj
//				VoteElgibilityChecking  checking2=factory.getBean("voting",VoteElgibilityChecking.class);
//				//invoke methods
//				System.out.println(checking2.checkElgibility());
//				
//				//destroy singletons
//				factory.destroySingletons();
	}

}
