package com.nt.bean;

import java.util.Date;

public class PersonalInfo {
	private String pname;
	private String paddrs;
	private  Date  dob;
	private  Date  doj;
	private  Date  dom;
	
	public PersonalInfo(String pname, String paddrs, Date dob, Date doj, Date dom) {
		
		this.pname = pname;
		this.paddrs = paddrs;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
	}

	@Override
	public String toString() {
		return "PersonalInfo [pname=" + pname + ", paddrs=" + paddrs + ", dob=" + dob + ", doj=" + doj + ", dom=" + dom
				+ "]";
	}
	
	

}
