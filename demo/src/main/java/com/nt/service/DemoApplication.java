package com.nt.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello world...");
		FirstClass fc=new FirstClass();
		System.out.println(" age checking ::"+fc.method(20));
	}

}
