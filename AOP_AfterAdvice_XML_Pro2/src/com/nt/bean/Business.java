package com.nt.bean;

public class Business {
	private int speed;
	public void car() {
		System.out.println("Business.car()");
	}
	
	public int engin() { //int
		System.out.println("Business.engin() int ::");
		return 1;
	}
	
	public float capacity() { //float
		System.out.println("Business.capacity( ) float :: "+speed);
		return 2.5f;
	}

	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Business [speed=" + speed + "]";
	}
	
}
