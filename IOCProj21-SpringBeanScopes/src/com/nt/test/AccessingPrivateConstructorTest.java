package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.service.Printer;

public class AccessingPrivateConstructorTest {
	public static void main(String[] args) {
		  try {
			  //Load class
			  Class c=Class.forName("com.nt.service.Printer");
			  //get acccess to constructors
			  Constructor cons[]=c.getDeclaredConstructors();
			  //get access to private cosntructor
			  cons[0].setAccessible(true);
			  //create object for loaded class 
			  Printer  p1=(Printer) cons[0].newInstance();
			  Printer  p2=(Printer) cons[0].newInstance();
			  
			  System.out.println(p1.hashCode()+"  "+p2.hashCode() +" ? "+p1.equals(p2));
			  
		  }//try
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		
	}//main
}
