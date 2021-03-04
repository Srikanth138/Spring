package com.nt.comps;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class Diesel implements IEngine {

	@Override
	public void start() {
		System.out.println("Desile.start()");
		
	}

	@Override
	public void stop() {
		System.out.println("Desile.stop()");
		
	}

}
