package com.nt.factory;

import com.nt.comps.CNGengine;
import com.nt.comps.Diesel;
import com.nt.comps.IEngine;
import com.nt.comps.Petrol;
import com.nt.comps.Vehicle;

public class VehicleiFactory {
	public static Vehicle getInstance(String engineType) {
		IEngine engg=null;
		//create Dependent class object 
		if(engineType.equalsIgnoreCase("s")) {
			engg=new Diesel();
		}
		else if(engineType.equalsIgnoreCase("petrol")) {
			engg=new Petrol();
		}
		else if(engineType.equalsIgnoreCase("cng")) {
			engg=new CNGengine();
		}
		else {
			new IllegalArgumentException("Invalid Engine Type...");
		}
		
		//create Target class obj
		Vehicle vehicle=new Vehicle();
		//assign Dependent object to target obj
		vehicle.setEngg(engg);
		return vehicle;
	}

}
