package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bean.Employee;

public class EmployeeDAO {
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public List<Employee> getAllEmployeesRowMapper(){  
		 return jt.query("select * from emp1",new RowMapper<Employee>(){  
		    @Override  
		    public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        Employee e=new Employee();  
		        e.setId(rs.getInt(1));  
		        e.setName(rs.getString(2));  
		        e.setSalary(rs.getInt(3));  
		        return e;  
		    }  // mapRow method
		    });  //return
	}//method
}//class
