package com.servicionetflix.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.servicionetflix.item.service.ItemService;
import com.servicionetflix.item.models.Item;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@GetMapping("/listar")
	public List<Item> list(){
		return itemService.finAll();
	}
	
	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		return itemService.findById(id, cantidad);
	}
}
