package com.xworkz.soilder.repository;

import com.xworkz.soilder.entity.SoldierEntity;
import com.xworkz.soilder.service.SoldierServiceImpl;

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
            query.setParameter("name", name);
            entities = query.getResultList();


            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();

            if (transaction.isActive()) {
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
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        SoldierEntity soldierEntity = null;
        try {
            factory = Persistence.createEntityManagerFactory("soldierUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            Query query = manager.createNamedQuery("getEntityByNameAndPhone");
            query.setParameter("name", name);
            query.setParameter("phone", phone);
            soldierEntity = (SoldierEntity) query.getSingleResult();

            transaction.commit();

        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            manager.close();
        }

        return soldierEntity;
    }

    @Override
    public List<SoldierEntity> getSoilderByAge() {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        List<SoldierEntity> soldierEntities = null;
        try {
            factory = Persistence.createEntityManagerFactory("soldierUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            Query query = manager.createNamedQuery("getAgeAbove25");
            soldierEntities = query.getResultList();

            transaction.commit();


        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            manager.close();
        }
        return soldierEntities;
    }

    @Override
    public List<SoldierEntity> getAgeBetween() {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        List<SoldierEntity> soldierEntities = null;
        try {
            factory = Persistence.createEntityManagerFactory("soldierUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            Query query = manager.createNamedQuery("getAgeBetween20And30");
            soldierEntities = query.getResultList();

            transaction.commit();


        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            manager.close();
        }
        return soldierEntities;
    }

    @Override
    public SoldierEntity getByEmail(String email) {

        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        SoldierEntity soldierEntity = null;
        try {
            factory = Persistence.createEntityManagerFactory("soldierUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            Query query = manager.createNamedQuery("getByEmail");
            query.setParameter("email", email);
            soldierEntity = (SoldierEntity) query.getSingleResult();

            transaction.commit();

        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            manager.close();
        }

        return soldierEntity;

    }

    @Override
    public SoldierEntity getByPhone(long phone) {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        SoldierEntity soldierEntity = null;
        try {
            factory = Persistence.createEntityManagerFactory("soldierUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            Query query = manager.createNamedQuery("getByPhone");
            query.setParameter("phone", phone);
            soldierEntity = (SoldierEntity) query.getSingleResult();

            transaction.commit();

        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            manager.close();
        }

        return soldierEntity;

    }

    @Override
    public String getNameByPlace(String place) {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        String name = null;
        try {
            factory = Persistence.createEntityManagerFactory("soldierUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();
            transaction.begin();
            Query query = manager.createNamedQuery("getNameByPlace");
            query.setParameter("placeBy", place);

            name = (String) query.getSingleResult();
            transaction.commit();

            System.out.println("Name " + name);
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            manager.close();
        }
        return name;
    }

    @Override
    public SoldierEntity getNameAndAgeByPhoneNo(long phoneNo) {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        SoldierEntity soldierEntity = new SoldierEntity();
        try {
            factory = Persistence.createEntityManagerFactory("soldierUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();
            transaction.begin();
            Query query = manager.createNamedQuery("getNameAndAgeByPhoneNo");

            query.setParameter("phoneBy", phoneNo);

            Object[] objects = (Object[]) query.getSingleResult();

            String name = (String) objects[0];
            int age = (int) objects[1];

            soldierEntity.setName(name);
            soldierEntity.setAge(age);


            System.out.println("Name " + soldierEntity.getName() + " age " + soldierEntity.getAge());


            transaction.commit();


        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            manager.close();
        }

        return soldierEntity;
    }

    @Override
    public List<String> getNameByAge() {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        List<String> list = new ArrayList<>();
        try {
            factory = Persistence.createEntityManagerFactory("soldierUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();
            transaction.begin();
            Query query = manager.createNamedQuery("getNameAbove30");

            list = query.getResultList();


            list.forEach(name -> System.out.println("Name " + name));
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
    public List<SoldierEntity> getNameAndPlaceAndEmailByAgeLessThan30() {
        EntityManagerFactory factory = null;
        EntityManager manager = null;
        EntityTransaction transaction = null;
        List<SoldierEntity> list = new ArrayList<>();
        String name = new String();
        String place = new String();
        String email = new String();

        try {
            factory = Persistence.createEntityManagerFactory("soldierUnit");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            Query query = manager.createNamedQuery("getNameAndPlaceAndEmailByAgeLessThan30");
            List<Object[]> objects = query.getResultList();
            for (Object[] o : objects) {
                name = (String) o[0];
                place = (String) o[1];
                email = (String) o[2];


                SoldierEntity soldierEntity=new SoldierEntity();

                soldierEntity.setName(name);
                soldierEntity.setPlace(place);
                soldierEntity.setEmail(email);

                list.add(soldierEntity);
            }




            transaction.commit();
            list.forEach(data -> System.out.println(data.getName() + data.getPlace() + data.getEmail()));

        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            manager.close();
        }
        return list;
    }


}
