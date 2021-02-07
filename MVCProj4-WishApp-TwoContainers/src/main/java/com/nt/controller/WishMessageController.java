package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
@Service("/wmc")
public class WishMessageController implements Controller {

	@Override
	@RequestMapping("/wish.htm")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// use service
		String msg = "hey...";

		// return MAV
		return new ModelAndView("result", "wMsg", msg);
	}

}
