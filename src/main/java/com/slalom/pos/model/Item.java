package com.slalom.pos.model;

public class Item {
	
	private String name;
	private Double price;
	private String id;
	
	public Item(String id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	
	public Double getPrice() {
		return price;
	}
	
}
