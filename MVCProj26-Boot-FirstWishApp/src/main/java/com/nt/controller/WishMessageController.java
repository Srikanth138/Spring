package com.nt.controller;

//http://localhost:4040/welcome
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nt.service.IWishMessageService;

@Controller
//@ResponseBody //SpringBoot directly reponse to the .Jsp files other wishes files are downlod
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
