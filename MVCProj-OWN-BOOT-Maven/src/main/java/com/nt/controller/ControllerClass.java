package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
	
	@RequestMapping("/home")
	public String go() {
		System.out.println("ControllerClass.go()");
		return "result";
	}

}
