package com.nt.test;

import java.util.List;

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
       
       List<Employee> list=edao.getAllEmployeesRowMapper(); 
       
       for(Employee e:list) {
    	System.out.println(" "+e);   
       }
       ((AbstractApplicationContext) ctx).close();
    }
}
