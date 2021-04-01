package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nt.beans.Employee;

public class DAOClass {

	public JdbcTemplate jt;
	public DAOClass(JdbcTemplate jt) {
		this.jt = jt;
	}

	public List<Employee> getAllEmployees() {
		return jt.query("select * from employee",
				new ResultSetExtractor<List<Employee>>() {

					public List<Employee> extractData(ResultSet rs)
							throws SQLException, DataAccessException {

						List<Employee> list = new ArrayList<Employee>();
						while (rs.next()) {
							Employee e = new Employee();
							e.setENo(rs.getInt(1));
							e.setEName(rs.getString(2));
							e.setEAdd(rs.getString(3));
							e.setESalary(rs.getInt(4));
							list.add(e);
						}
						return list;
					}
				});

	}
}
