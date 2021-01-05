package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity //Entity is create a table.-> same the class name and table name to create table "othervise" 
@Table(name="EMPLOYEE") //
@Data
public class Employee implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ENO")
	private  Integer eno; //WE CAN'T Controll IntegrWrapper Lenght
	
	@Column(name="ENAME",length=15)
	private  String ename;
	
	@Column(name="EADD",length=20)
	private  String eadd;
	
	@Column(name="ESALARY")
	private  Float esalary;

}
