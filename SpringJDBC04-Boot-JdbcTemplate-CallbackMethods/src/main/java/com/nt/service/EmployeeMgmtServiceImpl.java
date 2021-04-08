package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service("empService") // stereotype.Service mean every time we can use only the
						// one way not work in other/ out side (every time
						// Rotine work is called stereotype)
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired(required = true) // internally here care the object and you this
								// inteface reference
	private IEmployeeDAO dao;
	@Override
	public EmployeeDTO fetchEmployeeByNo(int eno) {
		// use DAO
		EmployeeBO bo = dao.getEmployeeByNo(eno);
		// convert BO to DTO
		EmployeeDTO dto = new EmployeeDTO();
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}

	@Override
	public List<EmployeeDTO> fetchEmployeesByDesg(String desg1, String desg2,
			String desg3) {
		// use DAO
		List<EmployeeBO> listBO = dao.getEmployeesByDesgs(desg1, desg2, desg3);
		// convert listBO to ListDTO
		List<EmployeeDTO> listDTO = new ArrayList();
		listBO.forEach(bo -> {
			EmployeeDTO dto = new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});

		return listDTO;
	}// fetchEmployeesByDesg
}
