package com.sri.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sri.model.Employee;
import com.sri.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	private IEmployeeService service;

	public EmployeeController(IEmployeeService service) {
		super();
		this.service = service;
	}

	// build create employee REST API
	// http://localhost:8080/api/employees
	@PostMapping // here insert the data that's we use post mapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp) {
		// @RequestBody we can used to conver json to object type
		return new ResponseEntity<Employee>(service.saveEmployee(emp), HttpStatus.CREATED);
	}

	// build get all employee REST API
	// http://localhost:8080/api/employees
	@GetMapping // here we are get the data that's why we use GetMapping
	public List<Employee> getAllEmp() {
		return service.getAllEmployee();
	}

	// get employee by Id Rest Api
	// http://localhost:8080/api/employees/1
	/*
	 * @GetMapping("{id}") public Optional<Employee>
	 * getEmpById(@PathVariable("id")//#1 int id) { return service.getEmpById(id); }
	 */

	// http://localhost:8080/api/employees/3
	// @GetMapping("{id}")
	@PostMapping("{id}")
	public Employee getEmpById2(@PathVariable("id") Integer id) {// #2
		// http://localhost:8080/api/employees/a?id=3
		// @GetMapping("/a")
		// public Employee getEmpById2(@RequestParam("id") Integer id) {//#2
		System.out.println("EmployeeController.getEmpById2()" + id);
		return service.getEmpById2(id);
	}

	@PutMapping("{id}") // update we can use putMapping
	public ResponseEntity<Employee> updateEmp(@PathVariable("id") Integer id, @RequestBody Employee e) {
//		 @RequestBody is used to convert json to object
		return new ResponseEntity<Employee>(service.updateEmp(e, id), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public void deleteId(@PathVariable("id") Integer id) {
		System.out.println("EmployeeController.deleteId()"+id);
		service.deleteEmpId(id);
	}

}
