package com.question2;

public class Product implements Comparable<Product>{
	
	private int productId;
	private String name;
	private double price;
	
	public Product(){
		
	}

	public Product(int productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product p1) {
		
		return p1.getPrice()>this.getPrice() ? 1 :-1;
		
	}
	

}
