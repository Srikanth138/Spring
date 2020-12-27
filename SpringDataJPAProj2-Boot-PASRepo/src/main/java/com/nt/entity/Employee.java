package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Employee")
public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id //primary key
	@GeneratedValue(strategy = GenerationType.AUTO) //sequance
	@Column(name="ENO") //table coloum name
	private  Integer eno;
	
	@Column(name="ENAME",length=15)
	private  String ename;
	
	@Column(name="EADD",length=20)
	private  String eadd;
	
	@Column(name="ESALARY")
	private  Float eSalary;
	
}
