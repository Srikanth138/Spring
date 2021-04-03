package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class MyExample extends Exception {
	private static final long serialVersionUID = 1L;
	Scanner sc = new Scanner(System.in);

	String s, name = null;
	public MyExample(String s) {
		super(s);
		this.s = s;
	}
	public String toString() {
		return ("UserDefine_MyException Occurred: " + s);
	}

	public void nPointer() {

		if (name.equals("hey")) {
			System.out.println("both are equal...");
		}
	}// nPointer

	public void arrayIndex() {

		System.out.println("ENTER A NUMBER_ARRAYINDEX..");
		int[] a = new int[sc.nextInt()];
		
		System.out.println("ENTER THE NUMBERS...");
		for (int i = 0; i <= a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i <= a.length; i++) {
			System.out.println(a[i]);
		}
	}// arrayIndex

	public void arithMetic() {
		System.out.println("Enter_Number_ZERO-ArithmeticException");
		int x = sc.nextInt();
		if (x != 0) {
			int y = 100 / x;
			System.out.println(y);
		}
	}

	public void NumberFormat() {
		System.out.println("Enter-NumberFormatException::");
		String s = sc.next();
		int n = Integer.parseInt(s);
		if (n != 0) {
			int a = n * 10;
			System.out.println("NUMBER IS ::" + a);
		}
	}
	
	void fileNot() throws FileNotFoundException {
		File f=new File("hello.txt");
        FileInputStream fis = null;
            try {
            	fis = new FileInputStream(f);
				while (fis.read()!=-1){
				    System.out.println(fis.read());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
            finally {
            	try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
            }
	}
}// class
public class UserDefineException {

	public static void main(String[] args){

		MyExample m = new MyExample("hello");
		try {
			System.out.println(m);
			throw new MyExample("Exception Will Occured.....123");
		} catch (MyExample e) {
			e.printStackTrace();
		}

		try {
			m.nPointer();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		try {
			m.arrayIndex();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		try {
			m.arithMetic();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		try {
			m.NumberFormat();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		try {
			m.fileNot();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
