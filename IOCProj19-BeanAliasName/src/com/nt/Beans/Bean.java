package com.nt.Beans;

import java.io.Serializable;

public class Bean implements Serializable {
	private int no;
	private String Name;

	public Bean(int no, String name) {
		this.no = no;
		Name = name;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Bean [no=" + no + ", Name=" + Name + "]";
	}

}
