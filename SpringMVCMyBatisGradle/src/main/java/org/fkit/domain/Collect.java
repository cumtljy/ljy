package org.fkit.domain;


public class Collect {
		
		private int id;	
		private int goodid;	// id	
		private int userid;			// 书名
		private String good_name;			// 作者
		private Double price;			// 价格
		private String image;
		private String username;              // 数量
	
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	

		
		
		
	
		public String getGood_name() {
			return good_name;
		}
		public void setGood_name(String good_name) {
			this.good_name = good_name;
		}
		
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		
		@Override
		public String toString() {
			return "Collect [goodid=" + goodid + ",id=" + id + ", userid=" + userid + ",good_name=" + good_name + ",price="
					+ price + ",  image=" + image + ", username=" + username
					+ "]";
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		public int getGoodid() {
			return goodid;
		}
		public void setGoodid(int goodid) {
			this.goodid = goodid;
		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}	
	}


