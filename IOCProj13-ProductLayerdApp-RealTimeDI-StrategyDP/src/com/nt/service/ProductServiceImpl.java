package com.nt.service;

import java.sql.SQLException;

import com.nt.Beans.ProductBean;
import com.nt.Bo.ProductBo;
import com.nt.dao.IProductDAO;

public class ProductServiceImpl implements IProductServiceImpl {
	
	IProductDAO dao;
	public ProductServiceImpl(IProductDAO dao) {
		this.dao = dao;
	}

	@Override
	public String processService(ProductBo bo) {
		int count = 0;

		try {
			// b.logic -> mrp=basePrice*0.063 =>8000*0.063=500
			float gst = bo.getQty() * bo.getBaseprice() * 0.063f;
			float mrp = bo.getBaseprice() + gst;
			bo.setMrp(mrp);

			count = dao.insert(bo);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count == 0 ? "FAILD"
				: "SUCESSFULLY INSERTED ::" + bo.getPname() + ", " + bo.getQty() + ", " + bo.getMrp();
	}

	@Override
	public String processService(ProductBean beans) {
		int count = 0;

		try {
			// b.logic -> mrp=basePrice*0.063 =>8000*0.063=500
			float gst = beans.getQty() * beans.getBaseprice() * 0.063f;
			float mrp = beans.getBaseprice() + gst;
			beans.setMrp(mrp);

			count = dao.insert(beans);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count == 0 ? "FAILD"
				: "SUCESSFULLY INSERTED ::" + beans.getPname() + ", " + beans.getStatus() + ", " + beans.getQty() + ", "
						+ beans.getMrp();
	}

}
