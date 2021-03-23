package com.company.mahesh;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MeheshPatel {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.print("Enter you Name ::");
		String name = br.readLine();
		System.out.println("enter a age ::");
		int age = br.read();
		int i = 1;
		if (i == 1) {
			while (i < 5) {
				System.out.println(name + " " + age  + i);
				i++;
			}
		} else
			System.out.println("falses");
	}
}
