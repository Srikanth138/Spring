package com.nt.entity;
//entity class can create the DataBase Table
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity //is contains db logics to connect it.
@Table(name="EMPLOYEE") //table is created this name 
@Data //All the lombok data will be there here
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Employee  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id //finding(or)creating the PrimaryKey
	@GeneratedValue(strategy = GenerationType.AUTO)  //Auto Generated Sequance Number
	@Column(name="ENO") //create coloum name
	private  Integer eno;
	
	@NonNull
	@Column(name="ENAME",length=15)
	private  String ename;
	
	@NonNull
	@Column(name="EADD",length=20)
	private  String eadd;
	
	@NonNull
	@Column(name="ESALARY")
	private  Float eSalary;

}
