package com.jsp.oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalDriver {
	public static void main(String[] args) {
		EntityManagerFactory Factory= Persistence.createEntityManagerFactory("dev");
		EntityManager em=Factory.createEntityManager();
		EntityTransaction et= em.getTransaction();
		Hospital hospital= new Hospital();
		hospital.setName("Apollo");
		hospital.setCeo("prakash");
		
		Branch branch1=new Branch();
		branch1.setName("Apollo-shivajinagar");
		branch1.setBranchManager("A");
		branch1.setBranchAdress("Banglore");
		
		Branch branch2=new Branch();
		branch2.setName("Apollo-marathahli");
		branch2.setBranchManager("B");
		branch2.setBranchAdress("Banglore");
		
		
		List<Branch> branches =new ArrayList<>();
		branches.add(branch1);
		branches.add(branch2);
		
		hospital.setBranches(branches);
		branch1.setHospital(hospital);
		branch2.sethospital(hospital);
		
		et.begin();
		em.persist(hospital);
		em.persist(branch1);
		em.persist(branch2);
		et.commit();
		
}
}
