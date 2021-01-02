package com.nt.Beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductBean implements Serializable {
	private String pname;
	private String type;
	private float baseprice;
	private String status;
	private float qty;
	private float mrp;

	public ProductBean() {
		System.out.println("ProductBean.ProductBean()-0");
	}

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
	
	public float getMrp() {
		return mrp;
	}

	public void setMrp(float mrp) {
		this.mrp = mrp;
	}

	@Override
	public String toString() {
		return "ProductBean [pname=" + pname + ", type=" + type + ", baseprice=" + baseprice + ", status=" + status
				+ ", qty=" + qty + ", mrp=" + mrp + "]";
	}

}
