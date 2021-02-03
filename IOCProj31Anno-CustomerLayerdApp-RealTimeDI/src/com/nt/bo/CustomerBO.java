/** BO class for one database table for one bo class. it communicate dto and dao class*/
package com.nt.bo;

import lombok.Data;

@Data
public class CustomerBO {
	private String cname;
	private String cadd;
	private float pamt;
	private float rate;
	private float time;
	private float intrAmt;

}
