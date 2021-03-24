package com.nt.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.nt.controller.BankController;
import com.nt.vo.CustomerVO;

public class RealtimeDITestWithAC {
	public static void main(String[] args) {
		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
		// get ConfigurableEnviroment object
		ConfigurableEnvironment env = (ConfigurableEnvironment) ctx
				.getEnvironment();
		// activate profile
		env.setActiveProfiles(new String[]{"prod", "test"});
		// specify spring bean cfg file and refresh the container
		ctx.setConfigLocation("com/nt/cfgs/applicationContext.xml");
		ctx.refresh();

		// get Controller class obj from IOC contaienr
		BankController controller = ctx.getBean("controller",
				BankController.class);
		// read inputs from enduserjan
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer name::");
		String name = sc.next();
		System.out.println("Enter customer address::");
		String addrs = sc.next();
		System.out.println("Enter Pinciple amount::");
		String pAmt = sc.next();
		System.out.println("Enter Rate of Intrest::");
		String rate = sc.next();
		System.out.println("Enter Time of Intrest::");
		String time = sc.next();
		// create CustomerVO class obj having all inputs
		CustomerVO vo = new CustomerVO();
		vo.setCname(name);
		vo.setCadd(addrs);
		vo.setPAmt(pAmt);
		vo.setRate(rate);
		vo.setTime(time);
		// invoke method
		try {
			// use controller classs
			String result = controller.processCustomer(vo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Problem in Customer Registration");
			e.printStackTrace();
		}
	}// main
}
