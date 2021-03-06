package com.nt.bean;

public class Address {
	private String city;
	private String state;
	private String county;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", county=" + county + "]";
	}

}
