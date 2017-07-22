package org.fkit.domain;

public class Cart {
	private int id;
	private int userid;
	private int goodid;
	private int oid;
	private String image;			// 书名
	private String good_name;			// 作者
	private Double price;			// 价格	
	private int quantity;
	private String username;


	

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getGood_name() {
			return good_name;
		}

		public void setGood_name(String good_name) {
			this.good_name = good_name;
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

		
		

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}	

@Override
public String toString() {
	return "Cart [userid=" + userid + ",id=" + id+ ",goodid=" + goodid + ",oid=" + oid+ ", good_name=" + good_name  + ", price="
			+ price + ", image=" + image + ", quantity=" + quantity
			+ ", quantity=" + quantity+", username=" + username+"]";
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}

public int getUserid() {
	return userid;
}

public void setUserid(int userid) {
	this.userid = userid;
}

public int getGoodid() {
	return goodid;
}

public void setGoodid(int goodid) {
	this.goodid = goodid;
}

public int getOid() {
	return oid;
}

public void setOid(int oid) {
	this.oid = oid;
}

}
