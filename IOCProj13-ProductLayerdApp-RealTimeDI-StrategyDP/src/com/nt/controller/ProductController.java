package com.nt.controller;

import com.nt.Bo.ProductBo;
import com.nt.DTO.ProductDTo;
import com.nt.service.IProductServiceImpl;
import com.nt.vo.ProductVo;

public class ProductController {
	private IProductServiceImpl service;
	
	
	public ProductController(IProductServiceImpl service) {
		this.service = service;
	}


	public String controller(ProductVo vo) {
		//convert CustomerVO to CustomerDTO
		ProductDTo dto=new ProductDTo();
		dto.setPname(vo.getPname());
		dto.setStatus(vo.getStatus());
		dto.setBaseprice(Float.parseFloat(vo.getBaseprice()));
		dto.setQty(Float.parseFloat(vo.getQty()));
		dto.setType(vo.getType());
		service.processService(new ProductBo());
		return null;
	}

}
