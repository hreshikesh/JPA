package com.xworkz.transport.Runner;

import com.xworkz.transport.Entity.BusEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class BusEnityRunner {

    private static EntityTransaction entityTransaction;

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =null;
                EntityManager entityManager =null;
                EntityTransaction entityTransaction =null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("transport");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();
//
//        List<BusEntity> busList = new ArrayList<>();
//
//        busList.add(new BusEntity(1, "KSRTC Express", "Bangalore", "Mangalore", 650, "06:30 AM"));
//        busList.add(new BusEntity(2, "VRL Travels", "Mangalore", "Bangalore", 750, "10:00 PM"));
//        busList.add(new BusEntity(3, "Sugama Tourist", "Udupi", "Bangalore", 600, "05:45 AM"));
//        busList.add(new BusEntity(4, "Durgamba", "Bangalore", "Udupi", 620, "09:15 PM"));
//        busList.add(new BusEntity(5, "SRS Travels", "Hubli", "Bangalore", 700, "06:00 AM"));
//        busList.add(new BusEntity(6, "Ganesh Travels", "Bangalore", "Karwar", 820, "08:30 PM"));
//        busList.add(new BusEntity(7, "Kukke Express", "Mangalore", "Kukke Subramanya", 450, "12:00 PM"));
//        busList.add(new BusEntity(8, "Canara Bus", "Kundapura", "Bangalore", 670, "10:45 PM"));
//        busList.add(new BusEntity(9, "Ocean Pearl", "Kasargod", "Mysore", 720, "07:00 AM"));
//        busList.add(new BusEntity(10, "Coastal Express", "Kannur", "Bangalore", 790, "08:15 PM"));
//
//
//        for(BusEntity busEntity:busList) {
//            entityManager.persist(busEntity);
//        }
//        entityTransaction.commit();

            BusEntity busEntity=entityManager.find(BusEntity.class,5);
            System.out.println(busEntity);
            busEntity.setBusName("Sugama");
            entityManager.merge(busEntity);
            entityTransaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManagerFactory.close();
            entityManagerFactory.close();
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }


    }
}
