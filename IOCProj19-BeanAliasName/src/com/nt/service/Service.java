package com.nt.service;

import com.nt.Beans.Bean;

public class Service {
	Bean bb;

	public Bean getBb() {
		return bb;
	}

	public void setBb(Bean bb) {
		this.bb = bb;
	}

	@Override
	public String toString() {
		return "Service [bb=" + bb + "]";
	}

}
