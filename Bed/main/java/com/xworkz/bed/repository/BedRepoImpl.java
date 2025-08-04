package com.xworkz.bed.repository;

import com.xworkz.bed.entity.BedEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BedRepoImpl implements BedRepo{

    @Override
    public void save(BedEntity bedEntity) {

        System.out.println("Repo is created");
        System.out.println(bedEntity);
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;

        if(bedEntity!=null){
            entityManagerFactory=Persistence.createEntityManagerFactory("Xworkz");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();


            try{
                entityTransaction.begin();
                entityManager.persist(bedEntity);
                System.out.println("Data saved to database");
                entityTransaction.commit();
            }catch (Exception e){
                if(entityTransaction.isActive()){
                    entityTransaction.rollback();
                }
            }finally {
                entityManager.close();
            }
        }else
            System.out.println("null");


    }
}
