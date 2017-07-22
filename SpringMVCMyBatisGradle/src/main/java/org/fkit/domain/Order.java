package org.fkit.domain;

import java.io.Serializable;

public class Order implements Serializable{
		private int id;
		private int userid;
		private String username;
		private String address;
		private String phone;
		private String status;
		private Double totalprice;
		private int goodid;
		private Double price;
		private int quantity;
		

		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}

		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}

		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		public Double getTotalprice() {
			return totalprice;
		}
		public void setTotalprice(Double totalprice) {
			this.totalprice = totalprice;
		}
		
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
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
		@Override
		public String toString() {
			return "Order [id=" + id + ", userid=" + userid +", username=" + username + ",address="
					+ address + ", phone=" + phone + ",totalprice=" + totalprice + ",status=" + status +",goodid=" + goodid +",price=" + price +",quantity=" + quantity +"]";
		}
	}
