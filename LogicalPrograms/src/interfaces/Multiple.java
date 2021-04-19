package interfaces;

interface A {
	void m1();
	default void prv() {
		System.out.println("A.prv()");
		// call();
	}

	static void name() {
		System.out.println("A.name()");
	}
	/*
	 * private static void call() { // private methods call inside the default
	 * method this are intraduced in java 9 }
	 */

}
interface B extends A {
	void m2();
//	void m1();
}
interface C extends A {
	void m3();
}
public class Multiple implements B, C {
	public static void main(String args[]) {
		Multiple m = new Multiple();
		m.m1();
		m.m2();
		m.m3();
//		m.prv();
	}

	@Override
	public void m1() {
		System.out.println("Multiple.m1()");
	}

	@Override
	public void m2() {
		System.out.println("Multiple.m2()");
	}

	@Override
	public void m3() {
		System.out.println("Multiple.m3()");
	}
}
