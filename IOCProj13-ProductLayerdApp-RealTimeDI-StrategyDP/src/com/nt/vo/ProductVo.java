//input values take
package com.nt.vo;

public class ProductVo {
	private String pname, type, baseprice, status, qty;

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

	public String getBaseprice() {
		return baseprice;
	}

	public void setBaseprice(String baseprice) {
		this.baseprice = baseprice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "ProductVo [pname=" + pname + ", type=" + type + ", baseprice=" + baseprice + ", status=" + status
				+ ", qty=" + qty + "]";
	}

}
