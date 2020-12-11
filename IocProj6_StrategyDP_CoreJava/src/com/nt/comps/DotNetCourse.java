package com.nt.comps;

public class DotNetCourse implements ICourse{
	
	@Override
	public void startTime() {
		System.out.println("DotNetCourse.StartTime()");
		
	}
	@Override
	public void stopTime() {
		System.out.println("DotNetCourse.StopTime()");
		
	}

}
