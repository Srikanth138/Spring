package com.nt.bean;

public class Employee {
	private int id;
	private String name;
	private long phone_No;
	private Address add;
	
	public Employee(int id, String name, long phone_No) {
		super();
		this.id = id;
		this.name = name;
		this.phone_No = phone_No;
	}

	
	public Employee(int id, String name, long phone_No, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.phone_No = phone_No;
		this.add = add;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone_No=" + phone_No + ", add=" + add + "]";
	}
	

	public void show() {
		System.out.println("Employee.show() ::");
		System.out.println(id+","+name+","+phone_No+","+add);
		
	} 
	
}
