package com.nt.main;

public class Employee {
	private int id;
	private String name;
	
	public Employee() {
		System.out.println("0-param Constractor ....");
	}
	
	public Employee(int id) {
		this.id=id;
		System.out.println("1-param Constractor ....Primitive type int:: "+id);
	}
	
	public Employee(String name) {
		this.name=name;
		System.out.println("1-param Constractor ....String :: "+name);
	}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("2-param Constructor define ::"+id+" "+name);
	}
		
	public void show() {
		System.out.println(id+" "+name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
