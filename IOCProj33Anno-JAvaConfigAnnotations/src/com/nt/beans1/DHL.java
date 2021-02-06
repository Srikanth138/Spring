package com.nt.beans1;

import javax.inject.Named;

@Named("dhl")  //equal to  @Component(value="courier")
public class DHL implements Courier {
	
	public DHL() {
		System.out.println("BlueDart: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		return "Delivering(BlueDart) products  having   "+oid +"order id";
	}

}
