package com.nt.beans1;

import javax.inject.Named;

@Named("fFlight")  //equal to  @Component(value="courier")
public class FirstFlight implements Courier {
	
	public FirstFlight() {
		System.out.println("BlueDart: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		return "Delivering(BlueDart) products  having   "+oid +"order id";
	}

}
