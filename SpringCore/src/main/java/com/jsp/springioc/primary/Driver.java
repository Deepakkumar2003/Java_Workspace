package com.jsp.springioc.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.helper.ConfigClass;

public class Driver {
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Customer customer= (Customer) context.getBean("customer");
		customer.loan();
	
}
}
