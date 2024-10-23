package hibernateBasic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDriver {
	public static void main(String[] args) {
		EntityManagerFactory Factory= Persistence.createEntityManagerFactory("dev");
		EntityManager em=Factory.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
//	    this is for adding the details
		
//	Employee e = new Employee();
//	e.setId(2);
//	e.setName("Avinash");
//	e.setAge(27);
//
	 
		
//		for fetching the details
		
	Employee e = em.find(Employee.class, 1);
	System.out.println(e.getId());
	System.out.println(e.getName());
	System.out.println(e.getAge());
	
//     for save and update the details
		et.begin();
	
//  	Employee e = em.merge(Employee.class,1);
//	System.out.println(e.getId());
//	System.out.println(e.getName());
//	System.out.println(e.getAge());
//	et.commit();
//	
		et.begin();
		em.persist(e);
		et.commit();
			
	
//  for delete the details
	
    //	Employee e = em.remove(Employee.class, 1);
	//	System.out.println(e.getId());
	//	System.out.println(e.getName());
	//	System.out.println(e.getAge());
	
	
	
	
	
		
	}
}
