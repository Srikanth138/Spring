package com.nt.controller;

//http://localhost:4040/welcome
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWishMessageService;

@Controller
public class WishMessageController {
	@Autowired
	IWishMessageService service;

	
//	@RequestMapping("/welcome")
	@GetMapping("/welcome")
//	@RequestMapping("/") //work with SpringBoot
	public String getValues(Map<String, Object> map) {
		String msg = "hello... <br> Welcome to first SpringBoot Application";
		map.put("name", service.getMassege());
		service.getMsg();
		map.put("c", "");
		map.put("msg", msg);

		// return lvn
		return "result";
	}

}
