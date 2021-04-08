package com.nt.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int empNo;
	  private String ename;
	  private String job;
	  private float sal;

}
