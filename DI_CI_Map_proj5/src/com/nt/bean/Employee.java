package com.nt.bean;

public class Employee {
	private int id;
	private String name;
	private long phone_No;
	
	public Employee(int id, String name, long phone_No) {
		super();
		this.id = id;
		this.name = name;
		this.phone_No = phone_No;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone_No + "]";
	} 
	
}
