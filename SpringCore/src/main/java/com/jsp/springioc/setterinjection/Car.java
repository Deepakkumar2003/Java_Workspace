package com.jsp.springioc.setterinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Cars")
public class Car {
private int id;
private String brand;
private double price;
public int getId() {
	return id;
}
@Value ("1")
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
@Value ("Maruti")
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
@Value ("2343.89")
public void setPrice(double price) {
	this.price = price;
}

}
