package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program {

	public static void main(String[] args) {
		
		Person P1 = new Person(null, "Carlos da Silva", "carlossilva@gmail.com");
		Person P2 = new Person(null, "Joaquin Torres", "joaquintorres@gmail.com");
		Person P3 = new Person(null, "Ana Maria", "anamaria@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbjpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(P1);
		em.persist(P2);
		em.persist(P3);
		em.getTransaction().commit();
		
		System.out.println("finish");
		em.close();
		emf.close();

	}

}