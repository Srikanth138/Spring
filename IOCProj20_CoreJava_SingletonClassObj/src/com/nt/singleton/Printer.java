//Printer.java (Singleton java class with minumum standards)
//sigleton means -> single mean's "one".  ton mean's Object
package com.nt.singleton;

public class Printer {

	// static reference variable with class data type
	private static Printer instance;

	// private constructor
	private Printer() {
		System.out.println("Printer.Printer() 0-ParamConstructor");
	}//constructor

	// public static factory method having singleton logic
	public static Printer getInstance() {
		if (instance == null) {
			instance = new Printer();
		}
		return instance;
	}//method
	
	//b.method
	public void printData(String msg) {
		System.out.println("Printer.printData() ::"+msg);
	}//b.method
	
}//class
