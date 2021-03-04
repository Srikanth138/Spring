package com.nt.comps;

import org.springframework.stereotype.Component;

@Component("cngEngine")
public class CNGEngine implements IEngine {
	public CNGEngine() {
		System.out.println("CNGEngine::0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("CNGengine.start()");

	}

	@Override
	public void stop() {
		System.out.println("CNGengine.stop()");

	}

}
