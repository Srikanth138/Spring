package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.Employee;
import com.nt.dao.EmployeeDAO;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
       
       EmployeeDAO edao=ctx.getBean("edao",EmployeeDAO.class);
 
       
              if (edao!=null) {
            	  edao.save(new Employee(23,"sonoo",50000));
            	  System.out.println("Inserted....");
              }
              else {
            	  System.out.println("Not Inserted...");
              }
       ((AbstractApplicationContext) ctx).close();
    }
}
