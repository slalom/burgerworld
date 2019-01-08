package com.slalom.pos.controller;
import com.slalom.pos.repository.ItemRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.omg.CORBA.portable.ApplicationException;
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

	@RequestMapping(value = "items", method = RequestMethod.GET)
	public Collection<Item> list(){
		return itemRepo.findAll();
	}
	
	@RequestMapping(value = "items/getItemByName", method = RequestMethod.GET)
	public List<Item> GetItemById(@RequestParam(value = "itemName", required=true) String itemName){
		return itemRepo.getByName(itemName);
	}
	
	@RequestMapping(value = "items", method = RequestMethod.POST)
	public Item create(@RequestBody Item item) {
		String generatedItemId = UUID.randomUUID().toString();
		Item itemToAdd = new Item(generatedItemId, item.getName(), item.getPrice());
		return itemRepo.insert(itemToAdd);
	}
	
	@RequestMapping(value = "items/{id}", method = RequestMethod.GET)
	public Optional<Item> get(@PathVariable String id) {
		return itemRepo.findById(id);
	}
	
	@RequestMapping(value = "items/{id}", method = RequestMethod.PUT)
	public Item update(@PathVariable String id, @RequestBody Item item) throws Exception {
		Item itemToUpdate = itemRepo.getById(id);

		if(itemToUpdate == null) {
			throw new Exception("ID: " + id + " does not exist");
		}

		if (id.compareTo(item.getId()) == 1)
			throw new Exception("ID passed in is " + id + " and is not the same as " + item.getId());

		itemRepo.save(item);
		return item;

	}
	
	@RequestMapping(value = "items/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		itemRepo.deleteById(id);
	}
}