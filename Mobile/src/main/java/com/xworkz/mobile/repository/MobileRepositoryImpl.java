package com.xworkz.mobile.repository;

import com.xworkz.mobile.entity.MobileEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MobileRepositoryImpl implements MobileRepository{
    @Override
    public MobileEntity save(MobileEntity mobileEntity) {
        System.out.println("Repo impl...."+mobileEntity);

        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;

        try {

            entityManagerFactory= Persistence.createEntityManagerFactory("mobile");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(mobileEntity);
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

    @Override
    public MobileEntity getMobileEntityById(int id) {
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        MobileEntity mobile=null;

        try {

            entityManagerFactory= Persistence.createEntityManagerFactory("mobile");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();

            mobile=entityManager.find(MobileEntity.class,id);
            entityTransaction.commit();

        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }

        }finally {
            entityManagerFactory.close();

        }


        return mobile;
    }

    @Override
    public boolean updateMobileEntityById(int id, String model) {
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        MobileEntity mobile=null;

        try {

            entityManagerFactory= Persistence.createEntityManagerFactory("mobile");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();

            mobile=entityManager.find(MobileEntity.class,id);
            mobile.setModel(model);
            entityTransaction.commit();
            return  true;

        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }

        }finally {
            entityManagerFactory.close();

        }


        return false;
    }

    @Override
    public void deleteMobileEntityById(int id) {
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        MobileEntity mobile=null;

        try {

            entityManagerFactory= Persistence.createEntityManagerFactory("mobile");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();

            mobile=entityManager.find(MobileEntity.class,id);
            entityManager.remove(mobile);
            entityTransaction.commit();


        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }

        }finally {
            entityManagerFactory.close();

        }


    }
}
