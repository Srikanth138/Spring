package com.nt.bean;

public class A {
	public void validAge(int age)throws Exception{
		
		if(age<18) {
			throw new ArithmeticException("Not a valid Numebr...");
		}
		else {
			System.out.println("you valid...");
		}
		
	}
}
