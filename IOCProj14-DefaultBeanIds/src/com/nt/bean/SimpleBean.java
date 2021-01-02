package com.nt.bean;

public class SimpleBean {
	private String name;
	private float age;

	public SimpleBean() {
		System.out.println("SimpleBean.SimpleBean() 0-Param Constructor");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(float age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SimpleBean [name=" + name + ", age=" + age + "]";
	}
}
