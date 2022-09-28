package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ItemsRepository;
import com.example.demo.model.Items;
import com.example.demo.service.ItemService;

@RestController
public class ItemsController { 
	
 @Autowired
 ItemService itemservice;
 
 // create mapping
 @PostMapping("/additems")
 public List<Items> addItems(@RequestBody List<Items> items) 
 {
	 return itemservice.createItems(items);
 }
 
 //get mapping for single user
 @GetMapping("/items/{id}")
 public Items getItemsById(@PathVariable int id)
 {
 return itemservice.getItemsById(id);
 }
 
//get mapping for multiple user
 @GetMapping("/items")
 public List<Items> getIAlltems()
 {
 return itemservice.getItems(0);
 }
 
 // update mapping
 @PutMapping("/updateitems")
 public Items updateItems(@RequestBody Items items)
 {
	 return itemservice.UpdateItems(items);
 }
 
 // delete mapping
 @DeleteMapping("/items/{id}")
 public String deleteItems(@PathVariable int id)
 {
	 return itemservice.deleteItemsByid(id);
 }
}
