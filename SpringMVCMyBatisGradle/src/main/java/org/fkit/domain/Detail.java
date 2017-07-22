package org.fkit.domain;

public class Detail {
	private int id;
	private int oid;
	private int goodid;
	private Double price;
	private int quantity;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGoodid() {
		return goodid;
	}
	public void setGoodid(int goodid) {
		this.goodid = goodid;
	}
	@Override
	public String toString() {
		return "Detail [id=" + id + ", oid=" + oid +", goodid=" + goodid + ",price="
				+ price+ ", quantity=" + quantity  +"]";
	}

}
