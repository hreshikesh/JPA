package com.xworkz.bisleri.repository;

import com.xworkz.bisleri.entity.BisleriEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BisleriRepositoryImpl implements BisleriRepository{
    @Override
    public BisleriEntity save(BisleriEntity bisleri) {
        System.out.println("Repo impl...."+bisleri);

        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;

        try {

            entityManagerFactory= Persistence.createEntityManagerFactory("bisleri");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(bisleri);
            entityTransaction.commit();

        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }

        }finally {
            entityManagerFactory.close();

        }





        return null;

    }
}
