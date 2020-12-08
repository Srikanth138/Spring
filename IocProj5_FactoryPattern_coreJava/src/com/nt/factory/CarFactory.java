package com.nt.factory;

import com.nt.comp.BudgetCar;
import com.nt.comp.ICar;
import com.nt.comp.Luxsary;
import com.nt.comp.SportsCar;

public class CarFactory {
	
//	factory method having ->Factory pattern logic
	public static ICar getinstance(String type) {
		
		ICar car=null;
		if(type.equalsIgnoreCase("luxsary")) {
			car=new Luxsary();
		}
		else if(type.equalsIgnoreCase("sports")) {
			car=new SportsCar();
		}
		else if(type.equalsIgnoreCase("budget")) {
			car=new BudgetCar();			
		}
		else {
			throw new IllegalArgumentException("Invalid Car Type...");
		}
		return car;
	}

}
