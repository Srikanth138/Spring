package com.nt;

import java.util.List;

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
		List<Employee> ll = dao.getAllEmployees();

		for (Employee e : ll) {
			System.out.println(e);
		}

		System.out.println("----------------------2");
		ll.forEach(System.out::println);

		System.out.println("........................3");
		ll.forEach(aa -> {
			System.out.println(aa);
		});
		((AbstractApplicationContext) ctx).close();

	}
}
