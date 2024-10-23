package com.jsp.springioc.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.helper.ConfigClass;

public class Driver {
public static void main(String[] args) {
	ApplicationContext ac= new AnnotationConfigApplicationContext(ConfigClass.class);
	
	Dog dog =(Dog)ac.getBean("dog");
	dog.bark();
}
}