package com.nt.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee implements Serializable {
	private int eNo;
	private String eName;
	private String eAdd;
	private float eSalary;

}
