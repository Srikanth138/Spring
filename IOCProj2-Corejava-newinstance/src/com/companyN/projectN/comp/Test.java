package com.companyN.projectN.comp;

public class Test {
	private int a,b,c;
	static {
		System.out.println("Test.static_block()");
	}
	
	public Test(int a, int b,int c) {
		System.out.println("Test.Test() 3-param constructor");
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Test(int a, int b) {
		System.out.println("Test.Test() 2-param constructor");
		this.a = a;
		this.b = b;
	}
	
	public Test() { 
		System.out.println("Test.Test() 0-param Constractor");
	}
	
	@Override
	public String toString() {
		return "toString() Test [a=" + a + ", b=" + b + ", c=" + c+"]";
	}
}
