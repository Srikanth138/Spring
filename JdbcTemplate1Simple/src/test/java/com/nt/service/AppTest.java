package com.nt.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.nt.beans.Employee;
import com.nt.dao.EmployeeDao;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	EmployeeDao ed=new EmployeeDao();
    	Employee e=new Employee(); 
		  e.setNo(103); 
    			ed.updateEmployee(e);
    	System.out.println("AppTest.shouldAnswerWithTrue()"+e);
    	 
		 
        assertTrue( true );
    }
}
