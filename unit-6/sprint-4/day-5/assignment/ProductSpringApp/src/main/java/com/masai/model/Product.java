package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	
	@Size(min=3,max=15,message="Name length must be between minimum 3 and maximum 15")
	private String productName;
	
	@NotNull
	@Min(value=1,message="Quantity cannot be less than 1")
	private Integer quantity;
	
	@NotNull
	@Min(value=100,message="Price cannot be less than 100")
	private Double price;
	
	@NotEmpty
//	@Pattern(regexp = "[Stationary]",message="Category must be Stationary,"
//			+ " ,Grocery or Electronics" ) 
	private String category;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, Integer quantity, Double price, String category) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.category = category;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + ", category=" + category + "]";
	}

}
