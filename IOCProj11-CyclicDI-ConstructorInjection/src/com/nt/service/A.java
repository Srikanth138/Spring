package com.nt.service;

public class A {
	private B b;

	

	public A(B b) {
		System.out.println("A.A()");
		this.b = b;
	}



	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
}
