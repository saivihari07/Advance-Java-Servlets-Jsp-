package com.hibernate.one_to_many.Hibernate_OnetoMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="CATEGORY")
public class Category {
	
	private long id;
	private String name;
	private List<Product> products;
	
	
	
	public Category(String name) {
		
		this.name = name;
	}
	@Id
	@Column(name="Category_Id")
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(mappedBy="CATEGORY", cascade=CascadeType.ALL)
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
