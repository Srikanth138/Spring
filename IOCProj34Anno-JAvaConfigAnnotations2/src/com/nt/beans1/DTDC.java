package com.nt.beans1;

import javax.inject.Named;

@Named("dtdc")  //equal to  @Component(value="courier")
public class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("DTDC: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		return "Delivering(DTDC) products  having   "+oid +"order id";
	}

}
