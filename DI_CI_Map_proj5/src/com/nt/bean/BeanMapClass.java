package com.nt.bean;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BeanMapClass {
	private Map<Address,Employee> ae;

	public BeanMapClass(Map<Address, Employee> ae) {
		super();
		this.ae = ae;
	}

	@Override
	public String toString() {
		return "BeanMapClass [ae=" + ae + "]";
	}
	
	public void shows() {
		System.out.println("BeanMapClass.shows() ::Map ");
		
		Set<Entry<Address,Employee>> set=ae.entrySet();  
		 
		 Iterator<Entry<Address,Employee>> itr=set.iterator();
		 
		 while(itr.hasNext()) {
			System.out.println(itr.next());
		 }
		
	}
	
}
