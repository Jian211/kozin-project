package com.mini.dev.product.domain;

import java.sql.Date;

public class Product {
	
	private int id;
	private String productName;
	private int productPrice;
	private int deliveryPrice;
	private int addDeliveryPrice;
	private String tags;
	private int outboundDays;
	private Date createDate;
	private int sellerId;
	private int categoryId;
	private boolean activeYn;
	public Product(int id, String productName, int productPrice, int deliveryPrice, int addDeliveryPrice, String tags,
			int outboundDays, Date createDate, int sellerId, int categoryId, boolean activeYn) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.deliveryPrice = deliveryPrice;
		this.addDeliveryPrice = addDeliveryPrice;
		this.tags = tags;
		this.outboundDays = outboundDays;
		this.createDate = createDate;
		this.sellerId = sellerId;
		this.categoryId = categoryId;
		this.activeYn = activeYn;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", deliveryPrice=" + deliveryPrice + ", addDeliveryPrice=" + addDeliveryPrice + ", tags=" + tags
				+ ", outboundDays=" + outboundDays + ", createDate=" + createDate + ", sellerId=" + sellerId
				+ ", categoryId=" + categoryId + ", activeYn=" + activeYn + "]";
	}
	public int getId() {
		return id;
	}
	public String getProductName() {
		return productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public int getDeliveryPrice() {
		return deliveryPrice;
	}
	public int getAddDeliveryPrice() {
		return addDeliveryPrice;
	}
	public String getTags() {
		return tags;
	}
	public int getOutboundDays() {
		return outboundDays;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public int getSellerId() {
		return sellerId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public boolean isActiveYn() {
		return activeYn;
	}
	
	
	
	
	
}
