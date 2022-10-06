package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Shopping")
public class Items {
 @Id
 @GeneratedValue
 private int Id;  // I am testing poll scm
 public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getFruits() {
	return fruits;
}
public void setFruits(String fruits) {
	this.fruits = fruits;
}
public String getVegetables() {
	return vegetables;
}
public void setVegetables(String vegetables) {
	this.vegetables = vegetables;
}
public String getGrocery() {
	return grocery;
}
public void setGrocery(String grocery) {
	this.grocery = grocery;
}
private String fruits;
 private String vegetables;
 private String grocery;
}
