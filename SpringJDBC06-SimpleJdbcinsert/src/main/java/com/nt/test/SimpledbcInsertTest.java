package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.model.ActorDetails;
import com.nt.service.IActorMgmtService;

public class SimpledbcInsertTest {

	public static void main(String[] args) {
		// create IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nt/cnfg/applicationContext.xml");
		// get Bean
		IActorMgmtService service = ctx.getBean("actorService",
				IActorMgmtService.class);
		try {
			// invoke b.method
			System.out.println(service.registerActor(new ActorDetails(662,
					"patel", "hyd", 14355L, 13554.0)));
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		}
		// close container
		((AbstractApplicationContext) ctx).close();

	}
}
