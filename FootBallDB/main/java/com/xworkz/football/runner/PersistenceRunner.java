package com.xworkz.football.runner;

import com.xworkz.football.entity.FootballEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersistenceRunner {

    public static void main(String[] args) {

       EntityManagerFactory emf= Persistence.createEntityManagerFactory("myPersistenceUnit");

      EntityManager em= emf.createEntityManager();

      EntityTransaction entityTransaction= em.getTransaction();
      entityTransaction.begin();

        FootballEntity football=new FootballEntity(1,"Ronaldo","Nehru Stadium");
        em.persist(football);
      entityTransaction.commit();
    }
}
