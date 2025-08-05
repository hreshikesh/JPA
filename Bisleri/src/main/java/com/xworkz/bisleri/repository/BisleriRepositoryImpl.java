package com.xworkz.bisleri.repository;

import com.xworkz.bisleri.entity.BisleriEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BisleriRepositoryImpl implements BisleriRepository {
    @Override
    public BisleriEntity save(BisleriEntity bisleri) {
        System.out.println("Repo impl...." + bisleri);

        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;

        try {

            entityManagerFactory = Persistence.createEntityManagerFactory("bisleri");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(bisleri);
            entityTransaction.commit();

        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }

        } finally {
            entityManagerFactory.close();

        }


        return null;

    }

    @Override
    public BisleriEntity getBisleriEntityById(int id) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        BisleriEntity bisleri = null;

        try {

            entityManagerFactory = Persistence.createEntityManagerFactory("bisleri");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            System.out.println("find method in repo");
            bisleri = entityManager.find(BisleriEntity.class, id);
            entityTransaction.commit();

        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }

        } finally {
            entityManagerFactory.close();

        }
        return bisleri;
    }

    @Override
    public boolean updateBisleriEntityById(int id, String location) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        BisleriEntity bisleri = null;

        try {

            entityManagerFactory = Persistence.createEntityManagerFactory("bisleri");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            System.out.println("update method in repo");
            bisleri = entityManager.find(BisleriEntity.class, id);
            bisleri.setLocation(location);
            entityTransaction.commit();

            return true;

        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }

        } finally {
            entityManagerFactory.close();

        }


        return false;
    }

    @Override
    public void deleteById(int id) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        BisleriEntity bisleri=null;

        try {

            entityManagerFactory = Persistence.createEntityManagerFactory("bisleri");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            System.out.println("delete method in repo");
            bisleri= entityManager.find(BisleriEntity.class,id);
            entityManager.remove(bisleri);
            entityTransaction.commit();



        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }

        } finally {
            entityManagerFactory.close();

        }



    }


}

