package com.nt.bean;

/* factory-method: represents the factory method that will be invoked to inject the bean.
   factory-bean: represents the reference of the bean by which factory method will be invoked. 
   					It is used if factory method is non-static.*/

public class A {
	public  B b;
	//static method
	public static A getA(){//factory method  
		
		System.out.println("A.getA() static method return type...");
	    return new A();  
	} 
	
	//static method
	public static B msg(){ 
		B.msgB();
		System.out.println("A.msg() B-calss static method return type...");
	    System.out.println("hello user"); 
	    return new B();
	}  
	
	//non-static method 
	public B msgb() {
		//b.msgNon();
		System.out.println("A.msgb() B-calss Non-static return type...");
		return new B();
	}
}
