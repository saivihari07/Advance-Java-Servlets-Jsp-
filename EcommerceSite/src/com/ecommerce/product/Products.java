package com.ecommerce.product;

public class Products {
   
	private int products_id;
	private String product_name;
	private int product_price;
	private String product_url;
	private String product_desc;
	private String product_cat;
	
	
	public int getProducts_id() {
		return products_id;
	}
	public void setProducts_id(int products_id) {
		this.products_id = products_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public String getProduct_url() {
		return product_url;
	}
	public void setProduct_url(String product_url) {
		this.product_url = product_url;
	}
	public String getProduct_desc() {
		return product_desc;
	}
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}
	public String getProduct_cat() {
		return product_cat;
	}
	public void setProduct_cat(String product_cat) {
		this.product_cat = product_cat;
	}
	@Override
	public String toString() {
		return "Products [products_id=" + products_id + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_url=" + product_url + ", product_desc=" + product_desc + ", product_cat="
				+ product_cat + "]";
	}
	
	
	
	
	
	
}
