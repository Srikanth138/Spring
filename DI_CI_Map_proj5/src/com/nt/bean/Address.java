package com.nt.bean;

public class Address {
	private String citys;
	private String states;
	private String contrys;
	
	public Address(String citys, String states, String contrys) {
		super();
		this.citys = citys;
		this.states = states;
		this.contrys = contrys;
	}

	@Override
	public String toString() {
		return "Address [citys=" + citys + ", states=" + states + ", contrys=" + contrys + "]";
	}
}
