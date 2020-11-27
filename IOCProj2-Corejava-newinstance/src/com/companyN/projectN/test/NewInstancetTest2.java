package com.companyN.projectN.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstancetTest2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//Load class
		Class c=Class.forName(args[0]);
		//get all declared constructor of loaded class
		Constructor cons[]=c.getDeclaredConstructors(); //java.lang.reflect.Constructor;
		
		//cons[index] -> will depend on the That calss(Test) orader Constructor Test(1)-cons[1],Test(2)-cons[0],Test(3)-cons[2]
		
		//create object using 0-param constractor
		Object obj1=cons[2].newInstance(); //newInstance()->not deprecated,0-param constructor calling
		System.out.println("obj1 data::"+obj1);
		
		System.out.println("-----------------");
		
		//create object using 3-param constractor
		Object obj3=cons[1].newInstance(10,20,30); //newInstance()->not deprecated,3-param constructor calling
		System.out.println("obj3 data::"+obj3);
		
		System.out.println("-----------------");
		
		//create object using 2-param constractor
		Object obj2=cons[0].newInstance(10,20); //newInstance()->not deprecated,2-param constructor calling
		System.out.println("obj2 data::"+obj2);

	}//main
}//class
//Run as-> Run configuration ->select -Argument type -> program args-> full class name (packageName.className)-> apply and run
