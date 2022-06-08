package com.hibernate.one_to_many.Hibernate_OnetoMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="Product")
public class Product {
	
	private int productId;
	private String name;
	private String desc;
	private float price;
	private Category category;
	
	
	public Product( String name, String desc, float price, Category category) {
		super();
		//this.productId = productId;
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.category = category;
	}
	
	@Id
	@Column(name="Product_Id")
	@GeneratedValue
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@ManyToOne
	@JoinColumn(name="Category_Id")
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
