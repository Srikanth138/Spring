package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVO;

public final class BankController {
	private  ICustomerMgmtService service;

	public BankController(ICustomerMgmtService service) {
		this.service = service;
	}
	public String processCustomer(CustomerVO vo)throws Exception {
		
		//convert CustomerVO to CustomerDTO
		CustomerDTO dto=new CustomerDTO();
		
		dto.setCname(vo.getCname());
		dto.setCadd(vo.getCadd());
		dto.setpAmt(Float.parseFloat(vo.getpAmt())); //vo class all are String type 
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		String result=service.calculateSimpleIntrestAmount(dto);
		return result;
	}
	
}
