package com.jsp.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.helper.ConfigClass;

public class Driver {
public static void main(String[] args) {
	ApplicationContext ac= new AnnotationConfigApplicationContext(ConfigClass.class);
	Pen pen=(Pen)ac.getBean("pen");
	Pen pen1=(Pen)ac.getBean("pen");
	System.out.println(pen);
	System.out.println(pen1);
	
}
}
