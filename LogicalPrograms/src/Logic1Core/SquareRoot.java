package Logic1Core;

import java.util.Scanner;
public class SquareRoot {
	
	Scanner sc = new Scanner(System.in);
	public void squart() {
		System.out.println("enter a number square");
		int a = sc.nextInt();
		int b = a * a;
		System.out.println(b);
	}// squart

	public void root() {
		System.out.println("enter a number Root");
		int a = sc.nextInt();
		System.out.println((int)Math.pow(a, 0.5));
	}// root

	public static void main(String args[]) {
		SquareRoot sr = new SquareRoot();
		sr.squart();
		sr.root();
	}// main
}// class
