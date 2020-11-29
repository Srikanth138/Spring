package com.nt.bean;

import java.util.Iterator;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private long phno;
	private List<Integer> salary;
	
	
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


	public List<Integer> getSalary() {
		System.out.println("Employee.getSalary()");
		return salary;
	}


	public void setSalary(List<Integer> salary) {
		System.out.println("Employee.setSalary()");
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phno=" + phno + ", salary=" + salary + "]";
	}
	
	public void showList() {
		Iterator<Integer> itr=salary.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	

}
