package com.nt.comps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	@Autowired
	@Qualifier("dEngine")
	private IEngine engg = null; // HAS-A property/composition

	public Vehicle() {
		System.out.println("Vehicle.Vehicle() 0-param Contractor");
	}
	public void journey(String sourcePlace, String destPlace) {
		engg.start();
		System.out.println("Jounery started at :: " + sourcePlace);
		System.out.println("jounery is going on......");
		engg.stop();
		System.out.println("Jounery ended at :: " + destPlace);
	}
}
