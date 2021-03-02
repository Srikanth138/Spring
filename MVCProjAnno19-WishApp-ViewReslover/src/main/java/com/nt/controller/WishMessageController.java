package com.nt.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWishMessageService;

@Controller
public class WishMessageController {
	@Autowired
	private IWishMessageService service;

	@RequestMapping("/welcome")
	public String showHome() {
		return "home"; // lvn
	}

	@RequestMapping("/wish")
	public String getMessage(Map<String, Object> map) {
		// use serivce
		String msg = service.generateWishMessage();
		System.out.println(map.getClass());

		map.put("sysDate", new Date());
		map.put("wMsg", msg);
		return "result";
	}
	@RequestMapping("/about")
	public String about(Map<String, Object> map) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("name", "srikanth");
		
		map.put("names", m);
		String a="im a bout page details";
		map.put("a", a);
		return "about1";

	}

	/*
	 * @RequestMapping("/wish") public void getMessage(ModelAndView mav) { //use
	 * serivce String msg=service.generateWishMessage(); //Model data
	 * mav.addObject("sysDate", new Date()); mav.addObject("wMsg",msg); //set
	 * LVN mav.setViewName("result"); }
	 */

}
