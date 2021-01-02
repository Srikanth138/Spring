package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.Beans.ProductBean;
import com.nt.Bo.ProductBo;

public class ProductDaoOracle implements IProductDAO{
	/*
	 * Sqeeuance :- create sequence pid_seq; INSERT INTO PRODUCT
	 * values(PID_SEQ.NEXTval,'srikanth','box',2,50,120);
	 */
	private final static String Insert_Query = "INSERT INTO PRODUCT VALUES(PID_SEQ.NEXTVAL,?,?,?,?,?)";
	DataSource ds;

	//DI
	public ProductDaoOracle(DataSource ds) {
		this.ds = ds;
	}

	public int insert(ProductBo bo) throws SQLException {

		// get pooled jdbc connection object
		Connection con = ds.getConnection();

		// create PreparedStatement object
		PreparedStatement ps = con.prepareStatement(Insert_Query);

		// set values to query params by collecting data from BO class obj
		ps.setString(1, bo.getPname());
		ps.setString(2, bo.getType());
		ps.setFloat(3, bo.getQty());
		ps.setFloat(4, bo.getBaseprice());
		ps.setFloat(5, bo.getMrp());

		// execute the SQL query
		int result = ps.executeUpdate();

		// close jdbc objs
		ps.close();
		con.close(); // releases the jdbc con object back to jdbc con pool
		return result;
	}

	@Override
	public int insert(ProductBean bean) throws SQLException {
		// get pooled jdbc connection object
				Connection con = ds.getConnection();

				// create PreparedStatement object
				PreparedStatement ps = con.prepareStatement(Insert_Query);

				// set values to query params by collecting data from BO class obj
				ps.setString(1, bean.getPname());
				ps.setString(2, bean.getType());
				ps.setFloat(3, bean.getQty());
				ps.setFloat(4, bean.getBaseprice());
				ps.setFloat(5, bean.getMrp());

				// execute the SQL query
				int result = ps.executeUpdate();

				// close jdbc objs
				ps.close();
				con.close(); // releases the jdbc con object back to jdbc con pool
				return result;
	}

}
