package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ItemsRepository;
import com.example.demo.model.Items;

@Service
public class ItemService {
@Autowired
ItemsRepository itemsRepository;

 // create method 
public List<Items> createItems(List<Items> items){
 return itemsRepository.saveAll(items);
}

//get method for single user
public Items getItemsById(int id){
	 return itemsRepository.findById(id).orElse(null);
}

//get method for multiple user
public List<Items> getItems(int id){
	 return itemsRepository.findAll();
	}

//Update method
  public Items UpdateItems(Items items) {
	 Items oldItems = null;
	 Optional<Items>optionalItems = itemsRepository.findById(items.getId());
	 if(optionalItems.isPresent()) {
		 oldItems = optionalItems.get();
		 oldItems.setFruits(items.getFruits());
		 oldItems.setVegetables(items.getVegetables());
		 oldItems.setGrocery(items.getGrocery());
		 itemsRepository.save(oldItems);
	 }
	 else {
	return new Items();
  }
   return oldItems;
  }
  public String deleteItemsByid(int id) {
	  itemsRepository.deleteById(id);
	  return "Items got deleted";
  }
}
