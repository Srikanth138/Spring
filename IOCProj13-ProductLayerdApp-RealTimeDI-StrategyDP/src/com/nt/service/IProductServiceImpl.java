package com.nt.service;

import com.nt.Beans.ProductBean;
import com.nt.Bo.ProductBo;

public interface IProductServiceImpl{
	public String processService(ProductBo bo);
	public String processService(ProductBean beans);

}
