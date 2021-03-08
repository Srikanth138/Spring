package com.nt.controler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeMgmtService;

@Controller
public class EmployeeController {
	@Autowired
	private  IEmployeeMgmtService  service;
	
	@RequestMapping("/welcome")
//	Webservice /SpringWeb Request's
//	@GetMapping("/welcome")
//	@PostMapping("/welcome")
//	@PutMapping("/welcome")
//	@DeleteMapping("/welcome")
	public   String showHome() {
		return "home";
	}
	
	//@RequestMapping("/list_emps")
	@GetMapping("/list_emps")
	public  String  collectAllEmployees(Map<String,Object> map) {
		//use  service
		List<EmployeeDTO> listDTO=service.fetchAllEmps();
		//keep resiults in Model Attributes
		map.put("listDTO",listDTO);
		//return lvn
		return "show_emps";
	}
}
