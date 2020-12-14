package com.nt.test;

import com.nt.comps.Vehicle;
import com.nt.factory.VehicleFactory;

public class Test {

	public static void main(String[] args) {
		Vehicle vehicle=VehicleFactory.getInstance();
		 //invoke b.method
		vehicle.journey("hyd", "goa");

	}

}
