package com.nt;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Model;
import com.nt.service.IServiceClass;

@Controller
// @ResponseBody
// @RestController //by defualt @RestController it contains @ResponseBody we are
// using in the REST API Time
public class MainClass {

	@Autowired
	IServiceClass s;

	/*
	 * @RequestMapping("/first") public String go() {
	 * System.out.println("MainClass.go()"); return "result"; }
	 */

	/*
	 * @RequestMapping("/first") public String go1() {
	 * System.out.println("MainClass.go1()"); return "WEB-INF/pages/result.jsp";
	 * }
	 */

	@GetMapping("/first")
	public String home() {
		System.out.println("MainClass.home()");
		return "home";
	}

	@RequestMapping("/home")
	public String go2(Map<String, Object> map,
			@RequestParam("name") String name) throws SQLException {
		// ServiceClass s = new ServiceClass();
		List<Model> ss = s.service(name);
		map.put("s", ss);
		System.out.println("MainClass.go2()");
		return "result";
	}

}
