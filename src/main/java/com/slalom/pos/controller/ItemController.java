package com.slalom.pos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slalom.pos.model.Item;

//import com.boot.controller.ShipwreckStub;
//import com.boot.model.Shipwreck;

@RestController
@RequestMapping("api/v1/")
public class ItemController {

	@RequestMapping(value = "items", method = RequestMethod.GET)
	public List<Item> list(){
		return new ArrayList<Item>();
		//return ShipwreckStub.list();
	}
	
	@RequestMapping(value = "items", method = RequestMethod.POST)
	public Item create(@RequestBody Item shipwreck) {
		//return ShipwreckStub.create(shipwreck);
		return new Item();
	}
	
	@RequestMapping(value = "items/{id}", method = RequestMethod.GET)
	public Item get(@PathVariable Long id) {
		//return ShipwreckStub.get(id);
		return new Item();
	}
	
	@RequestMapping(value = "items/{id}", method = RequestMethod.PUT)
	public Item update(@PathVariable Long id, @RequestBody Item shipwreck) {
		//return ShipwreckStub.update(id, shipwreck);
		return new Item();
	}
	
	@RequestMapping(value = "items/{id}", method = RequestMethod.DELETE)
	public Item delete(@PathVariable Long id) {
		//return ShipwreckStub.delete(id);
		return new Item();
	}
}