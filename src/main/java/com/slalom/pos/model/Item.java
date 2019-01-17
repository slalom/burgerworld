package com.slalom.pos.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

 
@Table
public class Item {
	
	@PrimaryKey
	private String id;	
	private String name;
	private Double price;
	private String imageFileName;

	
	public Item(String id, String name, Double price, String imageFileName) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.imageFileName = imageFileName;
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

	public String getImageFileName(){
		return imageFileName;
	}
	
}
