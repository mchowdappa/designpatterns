package com.mcp.designpatterns.behavioral.strategy;

import java.io.Serializable;

public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String itemName;
	
	private Double price;

	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(String name, Double price) {
		this.itemName = name;
		this.price = price;
	}
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
