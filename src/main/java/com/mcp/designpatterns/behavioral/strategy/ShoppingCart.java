package com.mcp.designpatterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	List<Item> items;
	public ShoppingCart() {
		items = new ArrayList<Item>();
	}

	public void addItem(Item item){
		items.add(item);
	}
	
	public void removeItem(Item item){
		items.remove(item); 	
	}
	
	private Double calculateTotal(){
		Double total = 0.0;
		
		for (Item item : items) {
			total = total +item.getPrice();
		}
		return total;
	}
	
	public void pay(PaymentStrategy paymentStrategy){
		paymentStrategy.pay(calculateTotal());
	}
}
