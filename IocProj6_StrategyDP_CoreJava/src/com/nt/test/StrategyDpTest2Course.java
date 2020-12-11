package com.nt.test;

import com.nt.comps.Course;
import com.nt.factory.CourseFactory;

public class StrategyDpTest2Course {

	public static void main(String[] args) {
		Course cc=CourseFactory.getInstance("Dotnet");
		cc.time(10.30f, 12.45f);

	}

}
