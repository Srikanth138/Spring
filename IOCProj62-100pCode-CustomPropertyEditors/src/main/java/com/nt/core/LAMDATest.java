package com.nt.core;

interface Test {
	public int m1();
}
interface Test1 {
	public void m2(int a);
}

public class LAMDATest {
	public static void main(String args[]) {
		// Return stmt
		Test t = () -> {
			return 50;
		};
		System.out.println("return " + t.m1());

		// single line Statement
		Test t1 = () -> 100;
		System.out.println("Single Line " + t1.m1());

		// multiline line Statement
		Test t2 = () -> 200;
		{
			System.out.println("MultiLine " + t2.m1());
		} ;

		System.out.println("================================");

		Test1 o = (x -> System.out.println(x));
		o.m2(101);

		Test1 o1 = (x -> {
			System.out.println(x);
		});
		o1.m2(102);

		Test1 o3 = System.out::println;
		o3.m2(103);

		Test1 o4 = System.out::println;
		o4.m2(10000);
	}// main
}// class
