package com.xworkz.soilder.repository;

import com.xworkz.soilder.entity.SoldierEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class SoldierRepositoryImpl implements SoldierRepository {
    @Override
    public void save(List<SoldierEntity> list) {
        EntityManagerFactory factory;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        try {
            factory = Persistence.createEntityManagerFactory("soldierUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            for (SoldierEntity soldierEntity : list) {
                manager.persist(soldierEntity);
            }
            transaction.commit();

        } catch (Exception e) {

            if (transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            manager.close();
        }
    }

    @Override
    public List<SoldierEntity> getAll() {
        EntityManagerFactory factory;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        List<SoldierEntity> list = new ArrayList<>();
        try {
            factory = Persistence.createEntityManagerFactory("soldierUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            Query query = manager.createNamedQuery("getAll");
            list = query.getResultList();


            transaction.commit();

        } catch (Exception e) {

            if (transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            manager.close();
        }
        return list;
    }

    @Override
    public List<SoldierEntity> getSoldierEntityByName(String name) {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        List<SoldierEntity> entities = new ArrayList<>();

        try {
            factory = Persistence.createEntityManagerFactory("soldierUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            Query query = manager.createNamedQuery("getEntityByName");
            query.setParameter("name",name);
            entities = query.getResultList();


            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();

            if ( transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
                manager.close();


                factory.close();
        }

        return entities;
    }

    @Override
    public SoldierEntity getSoilderEntityByNameAndPhone(String name, long phone) {
        EntityManagerFactory factory=null;
        EntityManager manager=null;
        EntityTransaction transaction=null;
        SoldierEntity soldierEntity=null;
        try{
            factory = Persistence.createEntityManagerFactory("soldierUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            Query query=manager.createNamedQuery("getEntityByNameAndPhone");
            query.setParameter("name",name);
            query.setParameter("phone",phone);
            soldierEntity=(SoldierEntity)query.getSingleResult();

            transaction.commit();

        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
        }finally {
            manager.close();
        }

        return soldierEntity;
    }

    @Override
    public List<SoldierEntity> getSoilderByAge() {
        EntityManagerFactory factory=null;
        EntityManager manager=null;
        EntityTransaction transaction=null;
        List<SoldierEntity> soldierEntities=null;
        try{
            factory = Persistence.createEntityManagerFactory("soldierUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            Query query=manager.createNamedQuery("getAgeAbove25");
            soldierEntities= query.getResultList();

            transaction.commit();




        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
        }finally {
            manager.close();
        }
        return soldierEntities;
    }

    @Override
    public List<SoldierEntity> getAgeBetween() {
        EntityManagerFactory factory=null;
        EntityManager manager=null;
        EntityTransaction transaction=null;
        List<SoldierEntity> soldierEntities=null;
        try{
            factory = Persistence.createEntityManagerFactory("soldierUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            Query query=manager.createNamedQuery("getAgeBetween20And30");
            soldierEntities= query.getResultList();

            transaction.commit();




        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
        }finally {
            manager.close();
        }
        return soldierEntities;
    }

    @Override
    public SoldierEntity getByEmail(String email) {

        EntityManagerFactory factory=null;
        EntityManager manager=null;
        EntityTransaction transaction=null;
        SoldierEntity soldierEntity=null;
        try{
            factory = Persistence.createEntityManagerFactory("soldierUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            Query query=manager.createNamedQuery("getByEmail");
            query.setParameter("email",email);
            soldierEntity=(SoldierEntity)query.getSingleResult();

            transaction.commit();

        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
        }finally {
            manager.close();
        }

        return soldierEntity;

    }

    @Override
    public SoldierEntity getByPhone(long phone) {
        EntityManagerFactory factory=null;
        EntityManager manager=null;
        EntityTransaction transaction=null;
        SoldierEntity soldierEntity=null;
        try{
            factory = Persistence.createEntityManagerFactory("soldierUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            Query query=manager.createNamedQuery("getByPhone");
            query.setParameter("phone",phone);
            soldierEntity=(SoldierEntity)query.getSingleResult();

            transaction.commit();

        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
        }finally {
            manager.close();
        }

        return soldierEntity;

    }


}
