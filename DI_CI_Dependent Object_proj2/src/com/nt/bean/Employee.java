package com.nt.bean;

public class Employee {
	private int id;
	private String name;
	private Address add;
	public Employee(int id, String name, Address add) {
		this.id = id;
		this.name = name;
		this.add = add;
	}
	
	public void show(){  
	    System.out.println(id+" "+name);  
	    System.out.println(add.toString());  
	}  
	
	  @Override 
	  public String toString() { 
		  return "Employee [id=" + id + ", name="+ name + ", add=" + add + "]"; }
	 
}
