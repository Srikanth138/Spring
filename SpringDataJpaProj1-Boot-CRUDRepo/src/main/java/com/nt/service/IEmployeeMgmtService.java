package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.dto.EmployeeDTO;

public interface IEmployeeMgmtService {
	
	public int registerEmployee(EmployeeDTO dto); //#1

	public int[] registerEmployeesGroup(List<EmployeeDTO> listDTO); // Array type pass the muliple values. //#2
	
	public long getEmployeesCount(); //#3
	
	public String removeEmployeeById(int id); //#4
	
	public Optional<EmployeeDTO> getEmployeeById(int id);//#5
	
	public String removeEmployeeById1(int id); //#6
	
	public Iterable<EmployeeDTO> getAllEmployees(); //#7
	public String removeEmployeesByGivenEntities(List<EmployeeDTO> listDTOs); //#8
	public List<EmployeeDTO> getEmployeesByIds(List<Integer> ids); //#9
}
