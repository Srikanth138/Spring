package com.nt.comps;

public class ByName {
	private int number;
	private long phoneNumber;
	private String address;
	
	public ByName(int number, long phoneNumber, String address) {
		this.number = number;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	@Override
	public String toString() {
		return "ByName [number=" + number + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
}
