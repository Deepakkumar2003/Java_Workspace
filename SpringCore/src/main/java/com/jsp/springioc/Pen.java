package com.jsp.springioc;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value ="prototype")
public class Pen {
public Pen () {
	System.out.println("pen constructor is invoked");
}

}
