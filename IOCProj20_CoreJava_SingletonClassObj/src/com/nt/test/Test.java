package com.nt.test;

import com.nt.singleton.Printer;

public class Test {

	public static void main(String[] args) {
		Printer print = Printer.getInstance();
		Printer print1 = Printer.getInstance();

		System.out.println("hasCode ::" + print.hashCode() + " ==" + print1.hashCode());
		System.out.println("both the hasCode ? " + (print == print1));
		print.printData(" CollegeDetail's");
		print1.printData(" Office Detail's");
	}

}
