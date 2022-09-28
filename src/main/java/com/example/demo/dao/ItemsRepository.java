package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer> {

}
