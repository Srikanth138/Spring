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
		dao.saveEmployeeByPreparedStatement(new Employee(15,"till", "...", 2001.00f));
		System.out.println("INSERTED SUCCESFULLY.....1");
		((AbstractApplicationContext) ctx).close();

	}
}
