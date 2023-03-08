package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class bakery {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int id;
private String Name;
private int Quantity;
private double Price;
private String img;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
public double getPrice() {
	return Price;
}
public void setPrice(double price) {
	Price = price;
}
public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}
public bakery(int id, String name, int quantity, double price, String img) {
	super();
	this.id = id;
	Name = name;
	Quantity = quantity;
	Price = price;
	this.img = img;
}
public bakery() {
	super();
	// TODO Auto-generated constructor stub
}


}