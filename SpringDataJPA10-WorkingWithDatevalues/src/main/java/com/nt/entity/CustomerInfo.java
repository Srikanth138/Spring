package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CustomerInfo {
	@Id
	@GeneratedValue //SequenceGenerator
	private Integer custId;
	@Column(length = 20)
	private  String  custName;
	private  Float  billAmt;
	private  LocalDate  dob;
	private  LocalTime  tob; //mysql
//	private  LocalDateTime  tob; //oracle
	private LocalDateTime billDate;

}
