package com.xworkz.poco.repository;

import com.xworkz.poco.entity.PocoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PocoRepoImpl implements PocoRepo{
    @Override
    public boolean save(PocoEntity pocoEntity) {

        System.out.println("Repo Implementation");
        System.out.println(pocoEntity);

        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;


        try {
            entityManagerFactory=Persistence.createEntityManagerFactory("MobileUnit");
            entityManager= entityManagerFactory.createEntityManager();
            entityTransaction= entityManager.getTransaction();

            entityTransaction.begin();
            entityManager.persist(entityManager);
            entityTransaction.commit();
        }catch (Exception e){
            if (entityTransaction.isActive()) {

                entityTransaction.rollback();
            }
        }



        return false;
    }
}
