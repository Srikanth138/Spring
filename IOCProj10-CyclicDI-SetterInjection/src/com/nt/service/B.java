package com.nt.service;

public class B {
	private A a;

	public void setA(A a) {
		System.out.println("B.setA()");
		this.a = a;
	}

	@Override
	public String toString() {
		return "B [a=" + a + "]"; ///toString() method call the A class.
	}
	
}
