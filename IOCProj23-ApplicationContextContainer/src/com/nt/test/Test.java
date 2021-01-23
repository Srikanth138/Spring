package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Vehicle;

public class Test {

	public static void main(String[] args) {

		// create IOC container
		/*
		 * ApplicationContext ctx = new
		 * FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		 * ApplicationContext ctx = new
		 * ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 */
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		System.out.println("...............");
//		
//		Vehicle ie = ctx.getBean("vehicle", Vehicle.class);
//		System.out.println(ie);
//		ie.journey("hyd", "goa");

		/*
		 * //create IOC container DefaultListableBeanFactory factory=new
		 * DefaultListableBeanFactory(); //create XmlBeanDefinitationReader object
		 * XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory); //Load
		 * and parse spring bean cfg file
		 * reader.loadBeanDefinitions("applicationContext.xml");
		 */

		/*
		 * //get Target class obj Vehicle
		 * vehicle=factory.getBean("vehicle",Vehicle.class); //invoke methods
		 * vehicle.journey("hyd", "goa");
		 */

		ApplicationContext ctx1 = new ClassPathXmlApplicationContext("com/nt/cnfg/ApplicationContext.xml");
		Vehicle ie = ctx1.getBean("vehicle", Vehicle.class);

		System.out.println(ie);
		ie.journey("hyd", "goa");

		((AbstractApplicationContext) ctx1).close();

	}

}
