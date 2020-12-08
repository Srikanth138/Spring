package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.Employee;
import com.nt.dao.EmployeeDao;

public class Test 
{
    public static void main( String[] args )
    {
        ApplicationContext cnt=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
        EmployeeDao ed=cnt.getBean("edao",EmployeeDao.class); //EmployeeDao.class is a super class object type. it is type casting data saved.
        		
        System.out.println("data save success.. ::"+ed.saveEmployeeByPreparedStatement(new Employee(101,"A",5000)));
        ((AbstractApplicationContext) cnt).close();
    }
}
