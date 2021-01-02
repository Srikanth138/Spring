package com.nt.dao;

import java.sql.SQLException;

import com.nt.Beans.ProductBean;
import com.nt.Bo.ProductBo;

public interface IProductDAO {
	public int insert(ProductBo bo) throws SQLException;
	public int insert(ProductBean bean) throws SQLException;

}
