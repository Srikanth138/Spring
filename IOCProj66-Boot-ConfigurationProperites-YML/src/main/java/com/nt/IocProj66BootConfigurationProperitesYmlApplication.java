package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.model.Person;

@SpringBootApplication
public class IocProj66BootConfigurationProperitesYmlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(IocProj66BootConfigurationProperitesYmlApplication.class, args);
	Person per=ctx.getBean("pb",Person.class);
	System.out.println(per);
	}

}
