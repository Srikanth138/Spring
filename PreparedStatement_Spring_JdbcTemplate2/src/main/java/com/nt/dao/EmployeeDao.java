package com.nt.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.nt.bean.Employee;

public class EmployeeDao {  
	private JdbcTemplate jt;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jt = jdbcTemplate;  
	}  
	  
	
	// <Boolean> is return type of all are same
	public Boolean saveEmployeeByPreparedStatement(final Employee e){  
	    String query="insert into emp1 values(?,?,?)";  
	    
	    return jt.execute(query,new PreparedStatementCallback<Boolean>(){  //this is Callable Statement Type
	    @Override  
	    public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {  
	              
	        ps.setInt(1,e.getId());  
	        ps.setString(2,e.getName());  
	        ps.setFloat(3,e.getSalary());  
	              
	        return ps.execute();  //this is callable statement type
	              
	    }  
	    });  
	}  

}
