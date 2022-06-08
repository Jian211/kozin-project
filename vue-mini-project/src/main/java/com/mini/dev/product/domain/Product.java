package com.mini.dev.product.domain;

public class Product {

	private String email;
	private int type;
	
	
	public void setType(int type) {
		this.type = type;
	}

	public Product(String email, int type) {
		super();
		this.email = email;
		this.type = type;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Product [email=" + email + ", type=" + type + "]";
	}
	
	
}
