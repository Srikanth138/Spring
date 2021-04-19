package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.model.PoliticalParty;
import com.nt.service.IPoliticalPartyMgmtService;

@SpringBootApplication
public class MappingSQLOperationsTest {
	public static void main(String[] args) {
		// create IOC container
		ApplicationContext ctx = SpringApplication
				.run(MappingSQLOperationsTest.class, args);
		// get Service class obj
		IPoliticalPartyMgmtService service = ctx.getBean("partyService",
				IPoliticalPartyMgmtService.class);
		try {
			PoliticalParty party = service
					.fetchPoliticalPartyDetailsByPartyId(179);
			if (party != null)
				System.out.println("179 party Details are ::" + party);
			else
				System.out.println("party not found");
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		}

		System.out.println("==============================");

		try {
			List<PoliticalParty> list = service
					.fetchPoliticalPartiesDetailsByPartyNames("BJP", "INC",
							"AAP");
			if (list != null || list.size() >= 1) {
				list.forEach(System.out::println);
			} else {
				System.out.println("No parties found");
			}
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		}

		System.out.println("==============================");
		try {
			System.out.println(
					service.modifyFlagColorsByPartyName("white color", "INC"));
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		}

		// close container
		((AbstractApplicationContext) ctx).close();

	}// main

}
