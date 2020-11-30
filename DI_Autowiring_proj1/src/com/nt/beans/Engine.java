package com.nt.beans;

public class Engine {
	private Bike bike; //autowire="byName" refer the .xml with same name ->it work only method's
	
	public Engine() { //autowire="constructor" refer the .xml ->it work only xml file's
		System.out.println("Engine.Engine() ::0-param..");
	}

	public Engine(Bike bike) {
		this.bike = bike;
		System.out.println("Engine.Engine() 2-param"+" , "+bike);
	}
	
	public Bike getBike() {
		return bike;
	}


	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public void show() {
		System.out.println("Engine.show()-method ::");
		bike.show();
	}
	@Override
	public String toString() {
		return "Engine [bike=" + bike + "]";
	}	
}
