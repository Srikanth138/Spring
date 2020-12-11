package com.nt.comps;

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
