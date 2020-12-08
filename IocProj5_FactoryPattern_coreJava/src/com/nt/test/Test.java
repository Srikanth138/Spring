/** Factory is a design pattern. at the time of calling the method pass different values based on value it returns different object is called factory pattern.
 * we can pass different value also it will return same object/return type is called factory method. 
 *  **** Factory method is used to save the object creation data.*/
package com.nt.test;

import com.nt.comp.ICar;
import com.nt.factory.CarFactory;

public class Test {

	public static void main(String[] args) {
		ICar cc=CarFactory.getinstance("sports"); //this method what ur passing the input that type of object will create 
		
		System.out.println("Test.main() "+cc.getClass());
		cc.addAccessories();
		cc.drive();
	}

}
