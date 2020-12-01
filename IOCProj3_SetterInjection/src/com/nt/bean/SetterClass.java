package com.nt.bean;

import java.util.Date;

public class SetterClass {
	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}
	static {
		System.out.println("static block Class loading time ...");
	}
	
	public SetterClass() {
		System.out.println("SetterClass.SetterClass():: 0-param constructr");
	}

	public String show(String name) {
		@SuppressWarnings("deprecation")
		int hh=date.getHours(); //24h format
		if(hh<12) {
			return "Good Moring..."+name;
		}
		else if(hh<16) {
			return "Goog AfterNoon..."+name;
		}
		else if(hh<20) {
			return "Goog AfterNoon..."+name;
		}
		else {
			return "Good Night..."+name;
		}
	}
	

}
