package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.service.IEmployeeMgmtService;

@SpringBootApplication
public class SpringDataJpaProj9CallingPlSqlProcedureMysqlApplication {

	public static void main(String[] args) {
		// get IOC container
		ApplicationContext ctx = SpringApplication.run(SpringDataJpaProj9CallingPlSqlProcedureMysqlApplication.class, args);
		// get Service class obj
		IEmployeeMgmtService service = ctx.getBean("empService", IEmployeeMgmtService.class);
		// invoke the method
		service.fetchEmpsByCities("hyd", "delhi").forEach(System.out::println);

		// close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
