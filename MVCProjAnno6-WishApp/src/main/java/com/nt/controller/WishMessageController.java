package com.nt.controller;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WishMessageController {

	//get request
	//@RequestMapping(name="sri",value={"/welcome","/register"})
//	@RequestMapping(value={"/welcome","/register"}, method =RequestMethod.POST)
//	@RequestMapping(value={"/welcome","/register"}, method = RequestMethod.GET)
	@RequestMapping(value={"/welcome","/register"}, method = {RequestMethod.GET,RequestMethod.POST})
	public String showHome(HttpServletRequest req) {
		System.out.println("Request :"+req.getMethod());
		return "home"; // lvn
	}

	@RequestMapping("/wish")
	public String getMessage(Map<String, Object> map) {
		// use serivce
		String msg = "hello";
		System.out.println(map.getClass());

		map.put("sysDate", new Date());
		map.put("wMsg", msg);
		return "result";
	}

}// class