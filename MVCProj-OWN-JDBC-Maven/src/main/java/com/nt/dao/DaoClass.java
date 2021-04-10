package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nt.model.Model;

@Repository
// @Component
public class DaoClass implements IDaoClass {
	private static final String GET_EMPS_QUERY = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP";
	@Autowired
	private JdbcTemplate jt;
	static int i = 0;
	@Override
	public List<Model> dao(String name) throws SQLException {
		System.out.println("name ::" + name);

		List<Model> listBO1 = jt.query(GET_EMPS_QUERY, new EmployeeExtractor());

		// count how users details are there
		// int count = jt.queryForObject(GET_EMPS_QUERY, Integer.class);
		System.out.println(i);

		return listBO1;
	}

	// nested inner class (static inner class)
	private static class EmployeeExtractor
			implements
				ResultSetExtractor<List<Model>> {

		@Override
		public List<Model> extractData(ResultSet rs)
				throws SQLException, DataAccessException {
			// convert RS into ListBO
			List<Model> listBO = new ArrayList();
			while (rs.next()) {
				Model bo = new Model();
				bo.setNo(rs.getInt(1));
				bo.setName(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSal(rs.getFloat(4));
				i+=1;//this is give wrong out put 
				listBO.add(bo);
			}

			return listBO;
		}
	}// inner class
}
