package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class EmployeeDTO implements Serializable {
	private Integer srNo;
	private Integer empNo;
	private String ename;
	private  Integer sal;
	private  String  job;

}