package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Employee;
import com.nt.dao.DAOClass;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nt/cnfg/applicationContext.xml");
		DAOClass dao = ctx.getBean("dao", DAOClass.class);
		System.out.println(dao.getClass().getName());
		dao.insert(new Employee(16,"till", "...", 2000.00f));
		System.out.println("INSERTED SUCCESFULLY.....");
		((AbstractApplicationContext) ctx).close();

	}
}
