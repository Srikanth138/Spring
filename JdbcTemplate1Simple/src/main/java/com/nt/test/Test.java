package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Employee;
import com.nt.dao.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");  
	      
	    EmployeeDao dao=ctx.getBean("edao",EmployeeDao.class);  //EmployeeDao.class ->is a object of the class with return type ,it is not a .class file 
	    
		/*
		 * int status=dao.saveEmployee(new Employee(103,"Amits",3500));
		 * System.out.println(status);
		 */  
	          
		/*
		 * int status=dao.updateEmployee(new Employee(103,"Sonoo",15000));
		 * System.out.println(status);
		 */ 
	      
	          
	    Employee e=new Employee(); 
	    e.setNo(103); 
	    int status=dao.deleteEmployee(e); 
	    System.out.println(status);
	    
	    ((AbstractApplicationContext) ctx).close();
	}

}
