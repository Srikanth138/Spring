package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtServiceImpl;
import com.nt.service.IEmployeeMgmtService;

@SpringBootApplication
public class SpringDataJpaProj3BootJpaRepositoryApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(SpringDataJpaProj3BootJpaRepositoryApplication.class, args);
		
		//get Service class obj
		IEmployeeMgmtService service=ctx.getBean("empService",EmployeeMgmtServiceImpl.class);
		System.out.println(".........abcdefghijklmnopqrstuvwxyz..........");
		
		//invoke methods
//		System.out.println("EMP Details"+service.fetchEmployeeById(4));
		service.fetchEmployeesExampleData(new EmployeeDTO(null,"srikanth","hyd",80000.0f),"ename", true).forEach(System.out::println);
		
		//close
		((ConfigurableApplicationContext) ctx).close();
	}

}
