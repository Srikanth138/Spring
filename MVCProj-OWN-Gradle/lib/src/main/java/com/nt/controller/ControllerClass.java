package com.nt.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {

	@GetMapping("/first")
	public String go() {
		System.out.println("ControllerClass.go()");
		return "display";

	}

	@RequestMapping("/second")
	// @PostMapping("/second")
	public String goPost(HttpServletRequest req, Map<String, Object> map1) {
		System.out.println("ControllerClass.goPost() ::" + req.getMethod());
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(101, "srikanth");
		map1.put("sri", map);

		return "second";
	}
}
