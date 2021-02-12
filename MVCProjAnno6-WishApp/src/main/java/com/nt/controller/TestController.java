package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	/*//get request
	//@RequestMapping(name="sri",value={"/welcome","/register"})
//	@RequestMapping(value={"/welcome","/register"}, method =RequestMethod.POST)
//	@RequestMapping(value={"/welcome","/register"}, method = RequestMethod.GET)
	@RequestMapping(value={"/welcome","/register"}, method = {RequestMethod.GET,RequestMethod.POST})
//	@RequestMapping(value="/")
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
	}*/
	
	//@RequestMapping(value="/")
		@RequestMapping
		public   String   showHome() {
			return "home";
		}
		
		
		@RequestMapping(value="/register")
		public   String   saveData1() {
			System.out.println("TestController.saveData1(-)");
			return "redirect:showEmps";
		}
		
		/*@RequestMapping(value="/register",method = RequestMethod.POST)  //POST  
		public   String   saveData2() {
			return 	"result2";
		}*/

}// class