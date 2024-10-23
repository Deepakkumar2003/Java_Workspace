package com.jsp.springioc.primary;

import org.springframework.stereotype.Component;

@Component
public class StateBankOfIndia implements Bank {
	public void homeLoan() {
		System.out.println("state bank loan is sancioned with 9.05 ");
		

	}
}

	


