package com.xworkz.bag.repository;

import com.xworkz.bag.entity.BagEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BagRepositoryImpl implements BagRepository{
    @Override
    public boolean save(BagEntity bag) {
        EntityManagerFactory factory=null;
        EntityManager manager=null;
        EntityTransaction transaction=null;
        try{
            factory= Persistence.createEntityManagerFactory("bag");
            manager=factory.createEntityManager();
            transaction=manager.getTransaction();
            transaction.begin();
            manager.persist(bag);
            transaction.commit();
        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
        }finally {
            manager.close();
        }
        return false;
    }
}
