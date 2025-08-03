package com.xworkz.transport.Runner;

import com.xworkz.transport.Entity.MetroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class MetroRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("transport");
             entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();

//        List<MetroEntity> metroList = new ArrayList<>();
//
//        metroList.add(new MetroEntity(1, "Majestic", "Whitefield", "₹30", "Bangalore", "Ravi Kumar"));
//        metroList.add(new MetroEntity(2, "Silk Board", "Kengeri", "₹25", "Bangalore", "Suresh N"));
//        metroList.add(new MetroEntity(3, "MG Road", "Yeshwantpur", "₹35", "Bangalore", "Anil J"));
//        metroList.add(new MetroEntity(4, "Central", "Airport Road", "₹40", "Hyderabad", "Imran Shaik"));
//        metroList.add(new MetroEntity(5, "Begumpet", "Gachibowli", "₹28", "Hyderabad", "Rahul Desai"));
//        metroList.add(new MetroEntity(6, "Anna Nagar", "Tambaram", "₹30", "Chennai", "Sundar R"));
//        metroList.add(new MetroEntity(7, "Guindy", "Chennai Central", "₹32", "Chennai", "Dinesh M"));
//        metroList.add(new MetroEntity(8, "MG Road", "Aluva", "₹34", "Kochi", "Jobin Jose"));
//        metroList.add(new MetroEntity(9, "Palarivattom", "Vyttila", "₹20", "Kochi", "Mathew T"));
//        metroList.add(new MetroEntity(10, "Kaloor", "Edapally", "₹22", "Kochi", "Ajith Menon"));
//
//        for(MetroEntity entity:metroList){
//            entityManager.persist(entity);
//        }
//
//        entityTransaction.commit();


            System.out.println(entityManager.find(MetroEntity.class,5));
            MetroEntity metroEntity=entityManager.find(MetroEntity.class,5);
            metroEntity.setCity("MNGLR");
            entityManager.merge(metroEntity);
            entityTransaction.commit();


            MetroEntity metroEntity1=entityManager.find(MetroEntity.class,6);
            MetroEntity metroEntity2=entityManager.find(MetroEntity.class,4);

            entityManager.remove(metroEntity1);
            entityManager.remove(metroEntity2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            entityManagerFactory.close();
            entityManager.close();
            if(entityTransaction.isActive())
                entityTransaction.rollback();
        }


    }
}
