package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class JobSeekerDTO implements Serializable {
	private  Integer jsId;
	private String jsName;
	private  String qlfy;
	private  byte[]  photo;
	private  char[]  resume;
	private  boolean  status;

}
