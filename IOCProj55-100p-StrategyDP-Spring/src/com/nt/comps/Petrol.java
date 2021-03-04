package com.nt.comps;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class Petrol implements IEngine{

	@Override
	public void start() {
		System.out.println("Petrol.start()");
	}
	
	@Override
	public void stop() {
		System.out.println("Petrol.stop()");
	}
}
