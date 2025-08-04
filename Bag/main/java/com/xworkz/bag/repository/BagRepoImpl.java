package com.xworkz.bag.repository;

import com.xworkz.bag.entity.BagEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BagRepoImpl implements BagRepo{

    public void save(BagEntity bagEntity){
        System.out.println("Repo is created");
        System.out.println(bagEntity);
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;

        if(bagEntity!=null){
            entityManagerFactory= Persistence.createEntityManagerFactory("Xworkz");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();


            try{
                entityTransaction.begin();
                entityManager.persist(bagEntity);
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



