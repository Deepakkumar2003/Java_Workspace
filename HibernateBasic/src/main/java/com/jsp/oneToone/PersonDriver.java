package com.jsp.oneToone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDriver {
public static void main(String[] args) {
	EntityManagerFactory Factory= Persistence.createEntityManagerFactory("dev");
	EntityManager em=Factory.createEntityManager();
	EntityTransaction et= em.getTransaction();
	
	Person personal =new Person();
	personal.setName("A");
	personal.setMobilenumber(932424454);
	
	Pan pan1=new Pan();
	pan1.setPanNumber("A123");
	pan1.setAddress("Banglore");
	
	personal.setPan(pan1);
	pan1.setPerson(personal);
	
	et.begin();
	em.persist(personal);
	em.persist(pan1);
	et.commit();
	
}
}
