package com.nt.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nt.dto.EmployeeDTO;
import com.nt.entity.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller
public class EmpController {
	@Autowired
	private IEmployeeMgmtService service;

	@GetMapping("/home")
	public String home() {
		System.out.println("StudController.home()");
		return "home";
	}

	@RequestMapping("/count")
	public ModelAndView count() {
		ModelAndView mav = new ModelAndView();
		long no = service.getEmployeesCount();// #3
		mav.addObject("no", no);
		mav.setViewName("count");
		return mav;
	}

	@RequestMapping("/result")
	public String get(@RequestParam("name") String ename,
			@RequestParam("add") String eadd,
			@RequestParam("salary") Float eSalary, Map<String, Object> map,
			@ModelAttribute("emp") EmployeeDTO dto) {

		// we are access the data from the end user and pass to dto class
		// EmployeeDTO dto1 = new EmployeeDTO(ename, eadd, eSalary);

		Employee e = new Employee(ename, eadd, eSalary);
		// invoke method
		// int no = service.registerEmployee(dto1);
		int no = service.registerEmployee(e);

		// dto1.setEno(no);
		e.setEno(no);

		// System.out.println(dto1.toString());
		System.out.println(e.toString());
		// pass the data to view Resolver
		map.put("dto", e);

		// copy recived data (no) to dto
		// BeanUtils.copyProperties(dto1, dto);

		return "result";
	}

	@RequestMapping("/remove")
	public String remove(@RequestParam("id") int id, Model model) {
		String remove = service.removeEmployeeById(id);
		model.addAttribute("remove", remove);
		return "remove";
	}

	@RequestMapping("/select")
	public String select(@RequestParam("id") int id, Model model) {
		Optional<EmployeeDTO> select = service.getEmployeeById(id);
		model.addAttribute("select", select);
		return "select";
	}

	@RequestMapping("/update")
	public String update(@RequestParam("id") Integer id,
			@RequestParam("name") String name, @RequestParam("add") String add,
			@RequestParam("salary") Float Salary, Map<String, String> map) {

		Employee e = new Employee(id, name, add, Salary);
		String update = service.updateEmployee(e);
		map.put("update", update);
		return "update";
	}

}
