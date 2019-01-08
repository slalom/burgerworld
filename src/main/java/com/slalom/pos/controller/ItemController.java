package com.slalom.pos.controller;
import com.slalom.pos.repository.ItemRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.slalom.pos.model.Item;


@RestController
@RequestMapping("api/v1/")
public class ItemController {
	private ItemRepository itemRepo;
	
	public ItemController(ItemRepository repo) {
		itemRepo = repo;
	}
	
	HashMap<String, Item> itemsHashMap = new HashMap<String, Item>();

	@RequestMapping(value = "items", method = RequestMethod.GET)
	public Collection<Item> list(){
		return itemsHashMap.values();
	}
	
	@RequestMapping(value = "items/getItemByName", method = RequestMethod.GET)
	public List<Item> GetItemById(@RequestParam(value = "itemName", required=true) String itemName){
		return itemRepo.getByName(itemName);
	}
	
	@RequestMapping(value = "items", method = RequestMethod.POST)
	public Item create(@RequestBody Item item) {
		String generatedItemId = UUID.randomUUID().toString();
		Item itemToAdd = new Item(generatedItemId, item.getName(), item.getPrice());
		itemsHashMap.put(itemToAdd.getId(), itemToAdd);
		return itemToAdd;
	}
	
	@RequestMapping(value = "items/{id}", method = RequestMethod.GET)
	public Item get(@PathVariable String id) {
		return itemsHashMap.get(id);
	}
	
	@RequestMapping(value = "items/{id}", method = RequestMethod.PUT)
	public Item update(@PathVariable String id, @RequestBody Item item) {
		itemsHashMap.put(id, item);
		return item;
	}
	
	@RequestMapping(value = "items/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		itemsHashMap.remove(id);
	}
}