package com.sri.service;

import java.util.List;
import java.util.Optional;

import com.sri.model.Employee;

public interface IEmployeeService {
	public Employee saveEmployee(Employee e);

	public List<Employee> getAllEmployee();

	public Optional<Employee> getEmpById(Integer id); // #1

	public Employee getEmpById2(Integer id); // #2

	public Employee updateEmp(Employee emp, Integer id);

	public void deleteEmpId(Integer id);

	// public long getCount();
}
