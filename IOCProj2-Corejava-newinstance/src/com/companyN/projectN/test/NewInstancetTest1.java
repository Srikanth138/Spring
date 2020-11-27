package com.companyN.projectN.test;

import com.companyN.projectN.comp.Test;

public class NewInstancetTest1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//Load class 
		Class c=Class.forName(args[0]); 
		
		//newInstance()-> java.lang.Class //create object-> object only 0-param constructor 
		Object obj=c.newInstance(); //newInstance() -> deprecated from java 9
		System.out.println("data ::"+obj);
		 
		
//		//Load class
//		Class c=Class.forName("com.companyN.projectN.comp.Test");
//		
//		//create the object for loaded class
//		Test t=(Test)c.newInstance();
//		t.toString();
		
	}
}

 //Run as-> Run configuration ->select -Argument type -> program args-> full class name (packageName.className)-> apply and run