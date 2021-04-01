package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.beans.Employee;

public class DAOClass {
	
	public JdbcTemplate jt;
	public DAOClass(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int insert(Employee e) {
		String insert_Query = "insert into employee values('" + e.getENo()
				+ "','" + e.getEName() + "','" + e.getEAdd() + "','"
				+ e.getESalary() + "')";
		return jt.update(insert_Query);
	}

}
