package com.nt.comps;

public class JavaCourse implements ICourse{

	@Override
	public void startTime() {
		System.out.println("JavaCourse.StratTime()");
		
	}
	@Override
	public void stopTime() {
		System.out.println("JavaCourse.StopTime()");
		
	}

}
