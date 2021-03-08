package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WishMessageController {

	// @RequestMapping("/welcome")
	@GetMapping("/welcome")
	public String getValues(Map<String, Object> map) {
		String msg = "hello... <br> Welcome to first SpringBoot Application";
		map.put("msg", msg);

		// return lvn
		return "result";
	}

}
