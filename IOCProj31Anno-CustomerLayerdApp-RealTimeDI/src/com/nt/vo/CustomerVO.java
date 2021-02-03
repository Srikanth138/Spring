/** vo class take the inputs from end user and comminicate the dto class*/
package com.nt.vo;

import lombok.Data;

@Data
public class CustomerVO {

	private String cname;
	private String cadd;
	private String pAmt;
	private String rate;
	private String time;

}
