package com.nt.beans;

import java.util.Iterator;
import java.util.Set;

public class Employee {
	private int id;  
	private String name;  
	private Set<Integer> salary;
	
	

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(Set<Integer> salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}  
	
	public void show(){
		Iterator<Integer> itr=salary.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	 return;
	}
	  
}
