package com.xworkz.motorola.repository;

import com.xworkz.motorola.entity.MotorolaEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MotorolaRepoImpl implements MotorolaRepo{
    @Override
    public boolean save(MotorolaEntity motorola) {

        System.out.println("Running repo Implementation");
        System.out.println(motorola);

        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;

        try{
            entityManagerFactory=Persistence.createEntityManagerFactory("MobileUnit");
            entityManager= entityManagerFactory.createEntityManager();
            entityTransaction= entityManager.getTransaction();

            entityTransaction.begin();
            entityManager.persist(motorola);
            entityTransaction.commit();

        }catch (Exception e) {
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }

        }finally {
            entityManager.close();
        }


        return false;
    }
}
