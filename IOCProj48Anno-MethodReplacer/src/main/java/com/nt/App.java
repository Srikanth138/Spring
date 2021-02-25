package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.BankLoanIntrestCalculator;

public class App {
	public static void main(String[] args) {
		// create IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nt/cfgs/applicationContext.xml");
		// get Bean object
		BankLoanIntrestCalculator calculator = ctx.getBean("blic",
				BankLoanIntrestCalculator.class);
		System.out.println(calculator.getClass() + "    "
				+ calculator.getClass().getSuperclass());
		// invoke method
		System.out.println("Intrest Amount ::"
				+ calculator.calculateIntrestAmount(50000, 1.82f, 12));
		// close container
		((AbstractApplicationContext) ctx).close();
	}
}
