package com.nt.dao;

//add the spring jdbc-5.3.1.jar
import org.springframework.jdbc.core.JdbcTemplate; 

import com.nt.beans.Employee;

public class EmployeeDao {
	
	//JdbcTemplate class is available in -> org.springframework.jdbc.core.JdbcTemplate
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
//	Statement st=con.CreateStatement();
//	st.excuteUpdate(query);
	public int saveEmployee(Employee e){  
	    String query="insert into emp1 values('"+e.getNo()+"','"+e.getEname()+"','"+e.getSalary()+"')";  
	    return jdbcTemplate.update(query);  
	}  
	public int updateEmployee(Employee e){  
	    String query="update emp1 set ename='"+e.getEname()+"',salary='"+e.getSalary()+"' where no='"+e.getNo()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteEmployee(Employee e){  
	    String query="delete from emp1 where no='"+e.getNo()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
}