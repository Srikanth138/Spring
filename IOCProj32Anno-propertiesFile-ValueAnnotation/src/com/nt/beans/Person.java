package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component("per") //is nothing but reference of object
@ToString
public class Person {
//	@Value("${per.id}")
	@Value("102")
	private int pid;
	
	@Value("srikanth")
	private String pname;
	
	@Value("24.0f")
	private  float age;

}
