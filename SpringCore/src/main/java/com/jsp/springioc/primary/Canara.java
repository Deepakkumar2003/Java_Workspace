package com.jsp.springioc.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Canara implements Bank {
	
	public void homeLoan() {
		System.out.println("Canera bank loan is sancioned");
		
		
	}

}
