package hibernateBasic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {

	public static void main(String[] args) {
		EntityManagerFactory Factory= Persistence.createEntityManagerFactory("dev");
		EntityManager em=Factory.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
//		this is for adding the details
		
		Student s = new Student();
    	s.setId(3);
		s.setName("Rajkumar");
		s.setAge(23);
		
		et.begin();
		em.persist(s);
		et.commit();
		
//		for fetching the details
		
	//	Student s = em.find(Student.class, 2);
	//	System.out.println(s.getId());
	//	System.out.println(s.getName());
	//	System.out.println(s.getAge());
		
	}
}
