package com.jsp.springioc.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Customer {
@Autowired
@Qualifier("stateBankOfIndia")
Bank bank;
 public void loan() {
	 
	 System.out.println("loan is pending");
	 bank.homeLoan();
	 System.out.println("Loan sanctioned");
 }
}
