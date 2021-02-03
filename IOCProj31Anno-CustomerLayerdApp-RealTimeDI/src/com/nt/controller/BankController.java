package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVO;

/*public final class BankController {
	private  ICustomerMgmtService service;*/

//@Controller("controller")
@Component("controller") //componet mean give "id" name of class object name in .xml file
public final class BankController {
	@Autowired
	private ICustomerMgmtService service;

	public BankController(ICustomerMgmtService service) {
		this.service = service;
	}
	public String processCustomer(CustomerVO vo) throws Exception {

		// convert CustomerVO to CustomerDTO
		CustomerDTO dto = new CustomerDTO();

		dto.setCname(vo.getCname());
		dto.setCadd(vo.getCadd());
		dto.setPAmt(Float.parseFloat(vo.getPAmt())); // vo class all are String
														// type
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));

		String result = service.calculateSimpleIntrestAmount(dto);
		return result;
	}

}
