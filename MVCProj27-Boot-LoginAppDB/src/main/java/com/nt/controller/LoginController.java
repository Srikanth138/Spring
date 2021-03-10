package com.nt.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.User;
import com.nt.service.ILoginService;

@Controller
public class LoginController {

	@Autowired // Autowired is search for class type
	// @Qualifier("ser") //Qualifier search by name type
	private ILoginService service;

	@GetMapping("/login")
	public String loginControl(@ModelAttribute User u) { 
		// for form launching (Initial phase request)
		// keep initial data in Model class obj
		u.setName("srik");
		// return lvn
		return "login_form";
	}

	@PostMapping("/login")
	public String logining(Map<String, Object> map, HttpServletRequest req,
			@ModelAttribute User u) { // for form submission (post back request)

		String name = req.getParameter("name"); // make form data as the model attribute(result)
		System.out.println(u);// make form data as the model attribute(result)
		map.put("name1", u);

		map.put("name", name);
		map.put("logic", service.login());
		return "result";
	}

}
