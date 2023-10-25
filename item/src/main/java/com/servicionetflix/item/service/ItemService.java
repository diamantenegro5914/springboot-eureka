package com.servicionetflix.item.service;

import java.util.List;

import com.servicionetflix.item.models.Item;

public interface ItemService {

	public List<Item> finAll();
	public Item findById(Long id, Integer cantidad);
	
}
