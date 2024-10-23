package com.jsp.springioc.variableinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.helper.ConfigClass;

public class CarDriver {
public static void main(String[] args) {
	ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigClass.class);
	Car c=(Car)ac.getBean("car");
	System.out.println(c.id);
	System.out.println(c.brand);
	System.out.println(c.price);
	
	Engine e=c.engine;
	e.m1();
}
}
