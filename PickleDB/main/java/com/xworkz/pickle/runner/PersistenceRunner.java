package com.xworkz.pickle.runner;

import com.xworkz.pickle.entity.PickleEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersistenceRunner {

    public static void main(String[] args) {

       EntityManagerFactory emf= Persistence.createEntityManagerFactory("Xworkz");

          EntityManager em= emf.createEntityManager();

         EntityTransaction entityTransaction= em.getTransaction();
         entityTransaction.begin();

        PickleEntity pickleEntity=new PickleEntity(1,"Yum yum pickle","Mango");
        em.persist(pickleEntity);

         entityTransaction.commit();
    }
}
