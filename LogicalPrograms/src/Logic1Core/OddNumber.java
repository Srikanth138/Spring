package Logic1Core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddNumber {

//	public List<Integer> odd(int ip) {
	static public List<Integer> odd() {
	List<Integer> r;
		int a = 0, i = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int ip = sc.nextInt();
		r = new ArrayList<Integer>();
		if (ip != 0) {

			for (i = 0; i <= ip; i++) {
				a = i % 2;
				if (a != 0) {

					r.add(i);
//					System.out.println("odd" + i);
//					return i;
				} // if

//			else {
//				System.out.println("even"+i);
//				//return i;
//			}//else
			} // for
				// return i-1;
			return r;
		} // if
			// return r;

		else {
			System.out.println("number is wrong..");
			return r;
		} // else
	}// method

	public static void main(String[] args) {
		System.out.println("enter a number...");
//		OddNumber od = new OddNumber();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ur number is ::" + od.odd(sc.nextInt()));
//		System.out.println("ur number is ::" + od.odd());
//		od.odd().forEach(System.out::println); //object creation to call
 
//		for(Integer a:odd()) { //forEach loop int==Integer
//			System.out.print(a+" ");	
//		}
		
//		odd().forEach(System.out::print); //static

//		odd().forEach(dd->System.out.print(dd+" ")); //single Statement
		
		odd().forEach(dd->{
			System.out.print(dd);	 //more than one Statement
			System.out.print(" ");
		});
	
		/*
		 * int a = 0, i = 0;
		 * 
		 * @SuppressWarnings("resource") Scanner sc = new Scanner(System.in); int ip
		 * =sc.nextInt(); if (ip != 0) { for (i = 1; i <= ip; i++) { a = i % 2;
		 * if(a!=0){ System.out.println("odd"+i); } else { System.out.println("even"+i);
		 * } }//for
		 * 
		 * } else { System.out.println("number is wrong.."); }//else
		 */
//		sc.close();
	}// main

}// class
