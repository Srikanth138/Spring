package com.nt.bean;

public class Business {
	
	public void validate(int age)throws Exception{  
	    if(age<18 || 100<age){  
//	        throw new ArithmeticException("Not valid age"); 
	        throw new ArrayIndexOutOfBoundsException("ArrayeIndex out of Bound");
	    }  
	    else{  
	        System.out.println("Thanks for vote");  
	    }  
	    }  
}
