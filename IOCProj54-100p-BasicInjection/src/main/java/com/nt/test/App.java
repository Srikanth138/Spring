package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.WishMessageGeneartor;
import com.nt.config.AppConfig;

public class App {
	public static void main(String[] args) {
//		 xml based use this
		// ApplicationContext ctx=new ClassPathXmlApplicationContext(""); 
	
		//Anotation based use this
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);

		// get Target spring bean class object
		WishMessageGeneartor generator = ctx.getBean("wmg",
				WishMessageGeneartor.class);
		// invoke b.method
		System.out.println(
				"Wish Message is ::" + generator.generateWishMessage("raja"));

		// close container
		((AbstractApplicationContext) ctx).close();
	}
}
