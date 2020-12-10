package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.Employee;
import com.nt.dao.EmployeeDAO;

public class App {
	public static void main(String[] args) {
		int count = 1;
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
		EmployeeDAO dao = ctx.getBean("edao", EmployeeDAO.class);
		List<Employee> list = dao.getAllEmployees();

		for (Employee e : list) {
			System.out.println("Extract THE RESULT From Row's..." + count + " :: " + e);
			count++;
		}
		((AbstractApplicationContext) ctx).close();
	}
}
