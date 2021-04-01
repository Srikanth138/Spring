package com.nt.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.nt.beans.Employee;

public class DAOClass {

	public JdbcTemplate jt;
	public DAOClass(JdbcTemplate jt) {
		this.jt = jt;
	}

	public Boolean saveEmployeeByPreparedStatement(final Employee e) {
		String query = "insert into employee values(?,?,?,?)";
		return jt.execute(query, new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {

				ps.setInt(1, e.getENo());
				ps.setString(2, e.getEName());
				ps.setString(3, e.getEAdd());
				ps.setFloat(4, e.getESalary());

				return ps.execute();

			}
		});

	}
}
