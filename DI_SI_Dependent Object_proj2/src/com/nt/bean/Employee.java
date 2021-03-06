package com.nt.bean;

public class Employee {
	private int id;
	private String name;
	private long phno;
	private Address address;
	
	public Address getAddress() {
		System.out.println("Employee.getAddress()");
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("Employee.setAddress()");
		this.address = address;
	}
	public int getId() {
		System.out.println("Employee.getId()");
		return id;
	}
	public void setId(int id) {
		System.out.println("Employee.setId()");
		this.id = id;
		
	}
	public String getName() {
		System.out.println("Employee.getName()");
		return name;
	}
	public void setName(String name) {
		System.out.println("Employee.setName()");
		this.name = name;
	}
	public long getPhno() {
		System.out.println("Employee.getPhno()");
		return phno;
	}
	public void setPhno(long phno) {
		System.out.println("Employee.setPhno()");
		this.phno = phno;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phno=" + phno + ", address=" + address + "]";
	}
	

}
