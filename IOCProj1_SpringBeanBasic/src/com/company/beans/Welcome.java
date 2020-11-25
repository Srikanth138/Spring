package com.company.beans;

public class Welcome {
	static{
		System.out.println("STATIC BLOCK....");
	}
	public Welcome(){
		System.out.println("Welcome.Welcome(-)....0-PARAM CONSTRACTOR");
	}
	public String getBean(String user){
		return "WELCOME ::"+user;
	}
}
