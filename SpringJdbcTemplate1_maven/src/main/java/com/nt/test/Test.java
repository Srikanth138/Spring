package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.Employee;
import com.nt.dao.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
		EmployeeDao dao=cnt.getBean("edao", EmployeeDao.class);//EmployeeDao.class ->is a object of class with return type -> it is not lossing data of type casting 
		// EmployeeDao.class is not a file type it is only a class object with return type.
		// java.lang.object m1(java.lang.object a){//java.lang.object is a super class of all java class objects & java.lang.Class is a super class of java}
		
		int status=dao.saveEmployee(new Employee(101, "srikanth", 35000) );
		
		 
	    System.out.println("inserted ::"+status);  
	          
	    /*int status=dao.updateEmployee(new Employee(101,"Sonoo",15000)); 
	    System.out.println("updated ::"+status); 
	    */  
	          
	    /*Employee e=new Employee(); 
	    e.setId(101); 
	    int status=dao.deleteEmployee(e); 
	    System.out.println(status);*/
	    
	    ((AbstractApplicationContext) cnt).close();
		
		
	}

}
