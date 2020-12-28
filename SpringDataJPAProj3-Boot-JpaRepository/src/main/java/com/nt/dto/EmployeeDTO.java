package com.nt.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
//@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor

@SuppressWarnings("serial")
public class EmployeeDTO implements Serializable{
	
	private Integer eno;
	
//	@NonNull
	private String ename;
//	@NonNull
	private String eadd;
//	@NonNull
	private Float salary;
	
	
	public EmployeeDTO(int eno) {
		this.eno = eno;
	}
	
}
