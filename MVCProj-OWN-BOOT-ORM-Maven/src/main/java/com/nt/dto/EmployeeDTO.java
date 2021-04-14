//lombok used to generet all the bean Properties
package com.nt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//use of these annotations are javaBean class mainlly
@Data //All setter ,getter ,hasCode(),toString() ,equals(), canEqual() is a equal methos with protected. and no-arg & all arg constructor
@RequiredArgsConstructor //one param or any param constractor you mention @NonNull in variable that constractor var will pass
@AllArgsConstructor //All  param constractor
@NoArgsConstructor //0-param  constractor

public class EmployeeDTO {
	
	private  Integer eno;
	@NonNull
	private  String ename;
	@NonNull
	private  String eadd;
	@NonNull
	private  Float eSalary;
	
	public  EmployeeDTO(int eno) {
		this.eno=eno;
	}

}
