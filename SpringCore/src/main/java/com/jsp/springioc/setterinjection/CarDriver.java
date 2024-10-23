package com.jsp.springioc.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.helper.ConfigClass;

public class CarDriver {
public static void main(String[] args) {
	ApplicationContext ac= new AnnotationConfigApplicationContext(ConfigClass.class);
	
	Car car= (Car) ac.getBean("Cars");
	System.out.println(car.getId());
	System.out.println(car.getBrand());
	System.out.println(car.getPrice());
	System.out.println("DONE THE PROGRAMES");
	
}
}
