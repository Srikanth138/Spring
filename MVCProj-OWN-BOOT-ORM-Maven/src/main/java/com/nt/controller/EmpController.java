package com.nt.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
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

import ch.qos.logback.core.joran.util.beans.BeanUtil;

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
			// @ModelAttribute("emp") EmployeeDTO dto,
			@ModelAttribute("atemp") Employee ee) {

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
	public String select(@RequestParam("eno") int id, Model model,
			@ModelAttribute("empFrm") Employee e) {
		Optional<EmployeeDTO> select = service.getEmployeeById(id);
		
		model.addAttribute("select", select);
		
		BeanUtils.copyProperties(select, e);
		return "update";
	}

	@RequestMapping("/update")
	public String update(@RequestParam("eno") Integer id,
			@RequestParam("ename") String name,
			@RequestParam("eadd") String add,
			@RequestParam("eSalary") Float Salary, Map<String, String> map,
			@ModelAttribute("empFrm") Employee ee) {

		Employee e = new Employee(id, name, add, Salary);
		BeanUtils.copyProperties(e, ee);
		String update = service.updateEmployee(ee);
		map.put("dto", update);
		return "result";
	}

}
