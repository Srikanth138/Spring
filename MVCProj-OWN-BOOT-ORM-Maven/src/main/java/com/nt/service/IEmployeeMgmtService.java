package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.dto.EmployeeDTO;
import com.nt.entity.Employee;

public interface IEmployeeMgmtService {

	// #1
	// public int registerEmployee(EmployeeDTO dto);
	public int registerEmployee(Employee entity);

	// Array type pass the muliple values. //#2
	public int[] registerEmployeesGroup(List<EmployeeDTO> listDTO);

	// #3
	public long getEmployeesCount();

	// #4
	public String removeEmployeeById(int id);

	// #5
	public Optional<EmployeeDTO> getEmployeeById(int id);

	// #6
	public String removeEmployeeById1(int id);

	// #7
	public Iterable<EmployeeDTO> getAllEmployees();

	// #8
	public String removeEmployeesByGivenEntities(List<EmployeeDTO> listDTOs);

	// #9
	public List<EmployeeDTO> getEmployeesByIds(List<Integer> ids);
	// #10
	public String updateEmployee(Employee emp);
}
