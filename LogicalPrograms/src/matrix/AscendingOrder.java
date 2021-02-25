package matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AscendingOrder {
	void order() {

		// Initialize array
		int[] arr = new int[]{5, 2, 8, 7, 1};
		int temp = 0;

		// Displaying elements of original array
		System.out.println("Elements of original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Sort the array in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // 5>2 ,5>8,5>7,5>1
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// ArrayList al[]=new ArrayList<Integer>[5];//Cannot create a generic
		// array of ArrayList<Integer>
		// ArrayList al[]=new ArrayList[5]{1,2,3,4,5}; //cannot convert from int
		// to ArrayList

		ArrayList<Integer> al1 = new ArrayList<Integer>(5);
		al1.add(90);
		al1.add(10);
		al1.add(5);
		al1.add(50);
		al1.add(0, 52);
		al1.add(0, 62); // index

		al1.forEach((a) -> {
			System.out.print(a + " ");
		});
		System.out.println("\nBefore ::" + al1);
		Collections.sort(al1);
		System.out.println("After ::" + al1);

		System.out.println("Jagde Matrix Integer...");
		Integer a1[][] = new Integer[2][];
		a1[0] = new Integer[2];
		a1[1] = new Integer[3];

		a1[0][0] = 10;
		a1[0][1] = 20;
		a1[1][0] = 22;
		a1[1][1] = 32;
		a1[1][2] = 21;

		for (Integer[] i : a1) {
			for (Integer i1 : i) {
				System.out.print(i1 + " ");
			}
			System.out.println();
		}
		Integer s1 = new Integer(10); // boxing
		int a = 20;
		Integer s2 = new Integer(a); // AutoBoxing
		int b = s2; // UnBoxing
		System.out.println("\n" + s1 + " " + s2 + " " + b);

		ArrayList<Integer> al = new ArrayList<Integer>();

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);
		al2.add(20);

		al.addAll(al2);

		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(30);
		al3.add(40);
		al.addAll(al3);
		ArrayList<Integer> al4 = new ArrayList<Integer>();
		al4.add(50);
		al4.add(60);
		al.addAll(al4);

		al.forEach((n) -> {
			System.out.print(n + " ");
		});
		System.out.println(" ");
		for (Integer i = 0; i < al.size(); i++) { // row
			for (Integer j = 0; j <= i; j++) { // col
				System.out.print(al.get(j) + " ");
			}
			System.out.println(" ");
		}

		System.out.println("\n");

		ArrayList<Integer> lm = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number..");
		String s = sc.next();
		int ii = Integer.parseInt(s);
		Integer ii1 = Integer.parseInt(s);
		lm.add(ii);
		lm.add(ii1);
		System.out.println(lm);

		System.out.println("---------");

		int aa[][] = new int[2][2];
		for (int i = 0; i < aa.length; i++) { // row
			for (int j = 0; j < aa[i].length; j++) { // col
				System.out.print(i+""+j+" ");
			}
			System.out.println(" ");
		}

		ArrayList<Integer> l[][] = new ArrayList[2][2];
		// l[0][0].add(10);
		for (int i = 0; i < l.length; i++) { // row
			for (int j = 0; j < i; j++) { // col
				// int aa=sc.nextInt();
				System.out.println(l[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		AscendingOrder ao = new AscendingOrder();
		ao.order();
	}

}
