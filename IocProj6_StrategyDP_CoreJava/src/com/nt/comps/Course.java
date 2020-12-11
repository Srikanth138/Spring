package com.nt.comps;

public class Course {
	private ICourse ic=null; //HAS-A property/composition
	
	public void setCourse(ICourse ic) {
		this.ic=ic;
	}
	
	public void time(float start,float stop) {
		
		ic.startTime();
		System.out.println("START TIME :: "+start);
		System.out.println("Course.time()");
		ic.stopTime();
		System.out.println("STOP TIME ::"+stop);
	}
	
}
