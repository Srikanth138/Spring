package com.nt.factory;

import com.nt.comps.Course;
import com.nt.comps.DotNetCourse;
import com.nt.comps.ICourse;
import com.nt.comps.JavaCourse;

public class CourseFactory {
	
	public static Course getInstance(String name) {
		ICourse ic=null;
		if(name.equalsIgnoreCase("java")) {
			ic=new JavaCourse();
		}
		else if(name.equalsIgnoreCase("DotNet")) {
			ic=new DotNetCourse();
		}
		else {
			throw new IllegalArgumentException("Invalide Input Type...");
		}
		
		//create Target class obj
		Course cc=new Course();
		//assign Dependent object to target obj
		cc.setCourse(ic);
		return cc;		
	}

}
