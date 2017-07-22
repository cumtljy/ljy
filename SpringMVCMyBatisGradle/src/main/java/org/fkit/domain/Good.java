package org.fkit.domain;

/**
 * CREATE TABLE tb_book (
	id INT (11) PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR (54),
	author VARCHAR (54),
	publicationdate DATE ,
	publication VARCHAR (150),
	price DOUBLE ,
	image VARCHAR (54),
	remark VARCHAR (600)
);
 * */
public class Good {
	
	private int id;				// id	
	private String good_name;			// 作者
	private String catagory_sn;		// 出版社
	private Double price;			// 价格
	private String image;
	private String image2;
    private String image3;
	private int stock;	
	private int sales;	
	
	public Good() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getCatagory_sn() {
		return catagory_sn;
	}

	public void setCatagory_sn(String catagory_sn) {
		this.catagory_sn = catagory_sn;
	}

	public String getGood_name() {
		return good_name;
	}

	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}

	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	public int getSales() {
		return sales;
	}



	public void setSales(int sales) {
		this.sales = sales;
	}
	


	public String getImage2() {
		return image2;
	}



	public void setImage2(String image2) {
		this.image2 = image2;
	}



	public String getImage3() {
		return image3;
	}



	public void setImage3(String image3) {
		this.image3 = image3;
	}




	@Override
	public String toString() {
		return "Good [id=" + id + ", good_name=" + good_name
				+ ", catagory_sn=" + catagory_sn + ", price=" + price + ", image=" + image
				+ ", image2=" + image2+ ", image3=" + image3+   ", stock=" + stock + ", sales=" + sales + "]";
	}

}
