package com.slalom.pos.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.slalom.pos.model.Item;

public interface ItemRepository extends CassandraRepository<Item, String> {
 
	@AllowFiltering
	public List<Item> getByName(String itemName);
 
}