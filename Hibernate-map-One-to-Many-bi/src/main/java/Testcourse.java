import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Testcourse {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("aniket");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		
		List <Course>c= new ArrayList();
		
		Student s= new Student();
		s.setName("aniket");
		s.setRoll_no(45);
		
		
		Course c1= new Course();
		c1.setName("web development");
		c1.setPrice(500);
		c1.setDuration("45hrs");
		c1.setStudent(s);
		
		Course c2= new Course();
		c2.setName("web development");
		c2.setPrice(500);
		c2.setDuration("45hrs");
		c2.setStudent(s);
		
		Course c3= new Course();
		c3.setName("web development");
		c3.setPrice(500);
		c3.setDuration("45hrs");
		c3.setStudent(s);
	
		c.add(c1);
		c.add(c2);
		c.add(c3);
		s.setCourse(c);
		
		entityTransaction.begin();
		
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(c3);
		entityManager.persist(s);
		entityTransaction.commit();
		System.out.println("all good");

		
	}

}
