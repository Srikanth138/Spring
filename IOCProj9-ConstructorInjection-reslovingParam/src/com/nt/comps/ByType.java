package com.nt.comps;

public class ByType {
	private int no;
	private long phno;
	private String name;
	
	public ByType(int no, long phno, String name) {
		this.no = no;
		this.phno = phno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ByType [no=" + no + ", phno=" + phno + ", name=" + name + "]";
	}
}
