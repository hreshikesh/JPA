package com.xworkz.driver.repository;

import com.xworkz.driver.entity.DriverEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class DriverRepositoryImpl implements DriverRepository{
    EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("driverUnit");

    @Override
    public boolean save(DriverEntity driverEntity) {
        System.out.println("Repo..."+driverEntity);
        EntityManager manager=null;
        EntityTransaction transaction=null;

        try {
             manager=entityManagerFactory.createEntityManager();
            transaction=manager.getTransaction();

            transaction.begin();

            manager.persist(driverEntity);

            transaction.commit();
        } catch (Exception e) {
            if(transaction.isActive()){
                transaction.rollback();
            }
        } finally {
            manager.close();
        }


        return false;
    }

    @Override
    public List<DriverEntity> getAll() {

        EntityManager manager=null;
        EntityTransaction transaction=null;
        List<DriverEntity> list=new ArrayList<>();

        try {
            manager=entityManagerFactory.createEntityManager();
            transaction=manager.getTransaction();

            transaction.begin();

           Query query= manager.createNamedQuery("getAll");
           list=query.getResultList();


           transaction.commit();



            transaction.commit();
        } catch (Exception e) {
            if(transaction.isActive()){
                transaction.rollback();
            }
        } finally {
            manager.close();
        }


        return list;

    }

    @Override
    public DriverEntity getById(int id) {
        EntityManager manager=null;
        EntityTransaction transaction=null;
        DriverEntity entity=new DriverEntity();

        try {
            manager=entityManagerFactory.createEntityManager();
            transaction=manager.getTransaction();

            transaction.begin();

            Query query= manager.createNamedQuery("getById");
            query.setParameter("idBy",id);
            entity=(DriverEntity) query.getSingleResult();






            transaction.commit();
        } catch (Exception e) {
            if(transaction.isActive()){
                transaction.rollback();
            }
        } finally {
            manager.close();
        }


        return entity;

    }

    @Override
    public boolean updateById(int id, String name) {
        EntityManager manager=null;
        EntityTransaction transaction=null;
        DriverEntity entity=new DriverEntity();

        try {
            manager=entityManagerFactory.createEntityManager();
            transaction=manager.getTransaction();

            transaction.begin();

            DriverEntity driverEntity= manager.find(DriverEntity.class,id);
           driverEntity.setName(name);
           manager.merge(driverEntity);


            transaction.commit();

            return true;
        } catch (Exception e) {
            if(transaction.isActive()){
                transaction.rollback();
            }
        } finally {
            manager.close();
        }


        return false;
    }

    @Override
    public boolean deleteById(int id) {
        EntityManager manager=null;
        EntityTransaction transaction=null;
        DriverEntity entity=new DriverEntity();

        try {
            manager=entityManagerFactory.createEntityManager();
            transaction=manager.getTransaction();

            transaction.begin();
            entity=manager.find(DriverEntity.class,id);
            manager.remove(entity);


            transaction.commit();



            return true;
        } catch (Exception e) {
            if(transaction.isActive()){
                transaction.rollback();
            }
        } finally {
            manager.close();
        }


        return false;
    }

    @Override
    public List<String> getEmailWithPattern() {
        EntityManager manager=null;
        EntityTransaction transaction=null;
        List<String> emails=new ArrayList<>();

        try {
            manager=entityManagerFactory.createEntityManager();
            transaction=manager.getTransaction();

            transaction.begin();


            Query query=manager.createNamedQuery("getEmailWithGmail");
            emails=query.getResultList();


            transaction.commit();




        } catch (Exception e) {
            if(transaction.isActive()){
                transaction.rollback();
            }
        } finally {
            manager.close();
        }


        return emails;

    }

    @Override
    public DriverEntity getNameAndEmailByPhone(long phone) {
        EntityManager manager=null;
        EntityTransaction transaction=null;
        DriverEntity driverEntity=new DriverEntity();

        try {
            manager=entityManagerFactory.createEntityManager();
            transaction=manager.getTransaction();

            transaction.begin();


            Query query=manager.createNamedQuery("getNameAndEmailByPhone");
            query.setParameter("phoneBy",phone);

            Object[] objects=(Object[]) query.getSingleResult();
            driverEntity.setName((String)objects[0]);
            driverEntity.setEmail((String)objects[1]);

            transaction.commit();




        } catch (Exception e) {
            if(transaction.isActive()){
                transaction.rollback();
            }
        } finally {
            manager.close();
        }


        return driverEntity;

    }

    @Override
    public List<DriverEntity> getDetailsByAgeGreater() {
        EntityManager manager=null;
        EntityTransaction transaction=null;
        List<DriverEntity> driverEntity=new ArrayList<>();


        try {
            manager=entityManagerFactory.createEntityManager();
            transaction=manager.getTransaction();

            transaction.begin();


            Query query=manager.createNamedQuery("getNameEmailPhoneAgeAbove");


            List<Object[]> objects=query.getResultList();
            for(Object[] object:objects){
                DriverEntity driver=new DriverEntity();
                driver.setName((String)object[0]);
                driver.setEmail((String) object[1]);
                driver.setPhone((long) object[2]);

                driverEntity.add(driver);

            }

            transaction.commit();




        } catch (Exception e) {
            if(transaction.isActive()){
                transaction.rollback();
            }
        } finally {
            manager.close();
        }


        return driverEntity;

    }
}
