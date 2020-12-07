package com.nt.beans;

public class Employee {
	private  int  no;
	private String ename;
	private int salary;
	
	public Employee() {

		System.out.println("0-param _Employee.Employee()");
	}
	
	
	public Employee(int no, String ename, int salary) {
		this.no = no;
		this.ename = ename;
		this.salary = salary;
	}


	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [no=" + no + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
}
