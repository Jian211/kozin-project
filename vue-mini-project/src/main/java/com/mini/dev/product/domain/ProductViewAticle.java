package com.mini.dev.product.domain;

import java.sql.Date;

public class ProductViewAticle {

	private int id;
	private String productName;
	private int productPrice;
	private int deliveryPrice;
	private int addDeliveryPrice;
	private String tags;
	private int outboundDays;
	private Date createdDate;
	private int sellerId;
	private String category1;
	private String category2;
	private String category3;
	private boolean activeYn;
	private String path;
	
	
	public ProductViewAticle(int id, String productName, int productPrice, int deliveryPrice, int addDeliveryPrice,
			String tags, int outboundDays, Date createdDate, int sellerId, String category1, String category2,
			String category3, boolean activeYn, String path) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.deliveryPrice = deliveryPrice;
		this.addDeliveryPrice = addDeliveryPrice;
		this.tags = tags;
		this.outboundDays = outboundDays;
		this.createdDate = createdDate;
		this.sellerId = sellerId;
		this.category1 = category1;
		this.category2 = category2;
		this.category3 = category3;
		this.activeYn = activeYn;
		this.path = path;
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
	public Date getCreatedDate() {
		return createdDate;
	}
	public int getSellerId() {
		return sellerId;
	}
	public String getCategory1() {
		return category1;
	}
	public String getCategory2() {
		return category2;
	}
	public String getCategory3() {
		return category3;
	}
	public boolean isActiveYn() {
		return activeYn;
	}
	public String getPath() {
		return path;
	}
	@Override
	public String toString() {
		return "ProductViewAticle [id=" + id + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", deliveryPrice=" + deliveryPrice + ", addDeliveryPrice=" + addDeliveryPrice + ", tags=" + tags
				+ ", outboundDays=" + outboundDays + ", createdDate=" + createdDate + ", sellerId=" + sellerId
				+ ", category1=" + category1 + ", category2=" + category2 + ", category3=" + category3 + ", activeYn="
				+ activeYn + ", path=" + path + "]";
	}

	
	
}
