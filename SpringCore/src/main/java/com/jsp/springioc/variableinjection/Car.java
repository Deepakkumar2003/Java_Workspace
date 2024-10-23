package com.jsp.springioc.variableinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Value("1")
 int id;
	
	@Value("swift")
 String brand;
	
	@Value("2233200.33")
 double price;
	
	@Autowired  // it is used to automatic dependency injection
	Engine engine;
}
