package com.nt.Bo;

public class ProductBo {
	private String pname;
	private String type;
	private int qty;
	private float baseprice;
	private float mrp;

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

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getBaseprice() {
		return baseprice;
	}

	public void setBaseprice(float baseprice) {
		this.baseprice = baseprice;
	}

	public float getMrp() {
		return mrp;
	}

	public void setMrp(float mrp) {
		this.mrp = mrp;
	}

	@Override
	public String toString() {
		return "ProductBo [pname=" + pname + ", type=" + type + ", qty=" + qty + ", baseprice=" + baseprice + ", mrp="
				+ mrp + "]";
	}

}