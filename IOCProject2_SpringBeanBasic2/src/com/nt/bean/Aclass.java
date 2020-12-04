package com.nt.bean;

public class Aclass {
	private int id;
	private String name;
	
	public Aclass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		}
	
	public void setId(int d) { //set-method will check the .xml file not check the variable
		this.id = d;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Aclass [id=" + id + ", name=" + name + "]";
	}

	
}
