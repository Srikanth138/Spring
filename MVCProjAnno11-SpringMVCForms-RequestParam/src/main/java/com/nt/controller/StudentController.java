package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
//	http://localhost:3036/MVCProjAnno10-SpringMVCForms-DataBinding/inputs?sno=101&sname=sri
//	only string can handile these type of values comma separate values to store list/Array 
//	http://localhost:3036/MVCProjAnno10-SpringMVCForms-DataBinding/inputs?sno=101&sname=sri&sname=mama&sname=hello
	/*@GetMapping("/inputs")
	public   String readData(Map<String,Object> map, @RequestParam int sno,@RequestParam String sname) {   //for form launching (Initial phase request)
		//make the recieved req param as the Model attributes
		map.put("stno",sno);
		map.put("stname",sname);
		//return lvn
		return "result";
	}*/
	
//	http://localhost:3036/MVCProjAnno10-SpringMVCForms-DataBinding/inputs?sno=101
	/*@GetMapping("/inputs")
	public   String readData(Map<String,Object> map, @RequestParam int sno,@RequestParam(required=false,defaultValue="Anonymouse") String sname) {   //for form launching (Initial phase request)
		//make the recieved req param as the Model attributes
		map.put("stno",sno);
		map.put("stname",sname);
		//return lvn
		return "result";
	}*/
	
//	http://localhost:3036/MVCProjAnno10-SpringMVCForms-DataBinding/inputs?sno=101&stub=mama&stub=hello&sname=sri
	@GetMapping("/inputs")
	public   String readData(Map<String,Object> map,@RequestParam int sno,@RequestParam(required=false,defaultValue="Anonymouse") String sname,@RequestParam String stub[]) {   //for form launching (Initial phase request)
		
		//make the recieved req param as the Model attributes
		map.put("stno",sno);
		map.put("stname",sname);
		map.put("stub", stub);
		//return lvn
		return "result";
	}
	

}