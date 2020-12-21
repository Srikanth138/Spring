package com.nt.entity;
//entity class can create the DataBase Table
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity //is a table data (db) 
@Table(name="EMPLOYEE") //table is created this name 
@Data //All the lombok data will be there here
public class Employee  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id //finding the PrimaryKey
	@GeneratedValue(strategy = GenerationType.AUTO)  //Auto Generated Sequance Number
	@Column(name="ENO") //create coloum name
	private  Integer eno;
	
	@Column(name="ENAME",length=15)
	private  String ename;
	
	@Column(name="EADD",length=20)
	private  String eadd;
	
	@Column(name="ESALARY")
	private  Float eSalary;	

}
