package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource; //jndi

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.bo.CustomerBO;

@Component("idao") //componet mean give "id" name of class object name in .xml file
public class CustomerDAOImpl implements ICustomerDAO {
	private final static String INSERT_CUSTOMER_QUERY = "INSERT INTO LAYERED_CUSTOMER VALUES(CUSTNO_SEQ.NEXTVAL,?,?,?,?,?,?)";
	
	@Autowired
	private DataSource ds;

	public CustomerDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBO bo) throws Exception {

		// get pooled jdbc con object
		Connection con = ds.getConnection();
		// Connection
		// con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

		// create PreparedStatement object
		PreparedStatement ps = con.prepareStatement(INSERT_CUSTOMER_QUERY);

		// set values to query params by collecting data from BO class obj
		ps.setString(1, bo.getCname());
		ps.setString(2, bo.getCadd());
		ps.setFloat(3, bo.getPamt());
		ps.setFloat(4, bo.getRate());
		ps.setFloat(5, bo.getTime());
		ps.setFloat(6, bo.getIntrAmt());

		// execute the SQL query
		int count = ps.executeUpdate();
		
		//close jdbc objs
		 ps.close();
		 con.close(); //releases the jdbc con object back to jdbc con pool

		return count;
	}

}
