package com.capg64;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPQLDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("citiesdb");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		String query1="Select c from Cities c";
		
				

	}

}
