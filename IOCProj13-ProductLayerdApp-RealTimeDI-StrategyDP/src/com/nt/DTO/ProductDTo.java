package com.nt.DTO;

import java.io.Serializable;

public class ProductDTo implements Serializable{
	private String pname;
	private String type;
	private float baseprice;
	private String status;
	private float qty;
	
	
	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public float getBaseprice() {
		return baseprice;
	}


	public void setBaseprice(float baseprice) {
		this.baseprice = baseprice;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public float getQty() {
		return qty;
	}


	public void setQty(float qty) {
		this.qty = qty;
	}


	@Override
	public String toString() {
		return "ProductDTo [pname=" + pname + ", type=" + type + ", baseprice=" + baseprice + ", status=" + status
				+ ", qty=" + qty + "]";
	}
}
