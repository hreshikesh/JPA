package com.xworkz.watch.repository;

import com.xworkz.watch.entity.WatchEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class WatchRepositoryImpl implements  WatchRepository{
    @Override
    public boolean save(List<WatchEntity> list) {
        EntityManagerFactory factory=null;
        EntityManager manager=null;
        EntityTransaction transaction=null;
        try{
            factory= Persistence.createEntityManagerFactory("bag");
            manager=factory.createEntityManager();
            transaction=manager.getTransaction();
            transaction.begin();
            for(WatchEntity watch:list) {
                manager.persist(watch);
            }
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
