package com.example.minilogin.model;

import java.sql.Date;
import java.time.LocalDateTime;

public class ProductInfo {
	private String product_id;
	private int category_type;  
	private Date create_time; 
	private String product_description; 
	private String product_icon;  
	private String product_name;  
	private float product_price; 
	private int product_status;  
	private int product_stock; 
	private Date update_time;
	
	
	public ProductInfo() {
	
	}
	
	
	public ProductInfo(String product_id, int category_type, Date create_time, String product_description,
			String product_icon, String product_name, float product_price, int product_status, int product_stock,
			Date update_time) {
		this.product_id = product_id;
		this.category_type = category_type;
		this.create_time = create_time;
		this.product_description = product_description;
		this.product_icon = product_icon;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_status = product_status;
		this.product_stock = product_stock;
		this.update_time = update_time;
	}
	
	
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public int getCategory_type() {
		return category_type;
	}
	public void setCategory_type(int category_type) {
		this.category_type = category_type;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public String getProduct_icon() {
		return product_icon;
	}
	public void setProduct_icon(String product_icon) {
		this.product_icon = product_icon;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public float getProduct_price() {
		return product_price;
	}
	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}
	public int getProduct_status() {
		return product_status;
	}
	public void setProduct_status(int product_status) {
		this.product_status = product_status;
	}
	public int getProduct_stock() {
		return product_stock;
	}
	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	
	
	@Override
	public String toString() {
		return "ProductInfo [product_id=" + product_id + ", category_type=" + category_type + ", create_time="
				+ create_time + ", product_description=" + product_description + ", product_icon=" + product_icon
				+ ", product_name=" + product_name + ", product_price=" + product_price + ", product_status="
				+ product_status + ", product_stock=" + product_stock + ", update_time=" + update_time + "]";
	} 
	

}
