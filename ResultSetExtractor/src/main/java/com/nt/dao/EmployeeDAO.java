package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nt.bean.Employee;

public class EmployeeDAO {
	private JdbcTemplate template;
	
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	public List<Employee> getAllEmployees(){ 
		
		//We can easily fetch the records from the database using "query()" method of 
		//JdbcTemplate class where we need to pass the instance of ResultSetExtractor.
		
		 return template.query("select * from emp1",new ResultSetExtractor<List<Employee>>(){
			 
		// ResultSetExtractor interface can be used to fetch records from the database. It accepts a ResultSet and returns the list.
		    
			 @Override  
			 //It defines only one method "extractData" that accepts ResultSet instance as a parameter.
		     public List<Employee> extractData(ResultSet rs) throws SQLException,DataAccessException {  
		      
		        List<Employee> list=new ArrayList<Employee>();  
		        Employee e=new Employee();
		        
//		        while(rs!=null){ 
		        while(rs.next()){ 
//		        Employee e=new Employee();
//		        	rs.next();
		        e.setId(rs.getInt(1));  
		        e.setName(rs.getString(2));  
		        e.setSalary(rs.getInt(3)); 
		          
		        //list.add(e);
		        } 
		        
		        list.add(e);
		        return list;  
		        }  
		    });  
		  }  
}
