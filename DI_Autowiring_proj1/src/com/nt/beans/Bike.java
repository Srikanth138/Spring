package com.nt.beans;

public class Bike {
	private int id;
	private String name;
	
	
	public Bike() {
		System.out.println("Bike.Bike() ::0-param constructor...");
	}


	public Bike(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Bike.Bike() 2-param constructor.."+id+" , "+name);
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("Bike.show()-method ::"+id+" , "+name);
	}

	@Override
	public String toString() {
		return "\n Bike [id=" + id + ", name=" + name + "]";
	}
	
}
