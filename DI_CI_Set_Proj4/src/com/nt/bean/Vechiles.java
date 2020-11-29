package com.nt.bean;

import java.util.*;

public class Vechiles {
	private String name;
	private String engid;
	private Set<Integer> price;
	public Vechiles(String name, String engid, Set<Integer> price) {
		super();
		this.name = name;
		this.engid = engid;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vechiles [name=" + name + ", engid=" + engid + ", price=" + price + "]";
	}
	public void show() {
		System.out.println("Vechiles.show()");
		System.out.println("name=" + name + ", engid=" + engid + ", price=" + price);
		
		Iterator<Integer> itr=price.iterator();
		System.out.println("Price ::");
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
