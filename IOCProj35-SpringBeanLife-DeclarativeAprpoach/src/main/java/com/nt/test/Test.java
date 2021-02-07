package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoteElgibilityChecking;

public class Test {
	public static void main(String args[]) {

		// using ClassPathXmlApplicationContext
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nt/cfgs/applicationContext.xml");
		VoteElgibilityChecking v = ctx.getBean("ve",
				VoteElgibilityChecking.class);

		System.out.println(v.checkElgibility());

		ctx.close();
	}

}
