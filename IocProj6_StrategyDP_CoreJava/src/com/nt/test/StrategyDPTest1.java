package com.nt.test;

import com.nt.comps.Vehicle;
import com.nt.factory.VehicleiFactory;

public class StrategyDPTest1 {

	public static void main(String[] args) {
		try {
			//get Vehicle object (target class obj)
			Vehicle vehicle=VehicleiFactory.getInstance("cng");
			//invoke b.method
			vehicle.journey("hyd", "delhi");
		}
		catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

}
