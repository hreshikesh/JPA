package com.xworkz.television.runner;

import com.xworkz.television.entity.TelevisionInfoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class TelevisionInfoRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Television");
//        if(entityManagerFactory!=null){
//            System.out.println("Connected Sucessfully");
//        }

        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();

        transaction.begin();

//        List<TelevisionInfoEntity> televisionInfoEntities=new ArrayList<>();
//        televisionInfoEntities.add(new TelevisionInfoEntity(1, "Sony Bravia XR", 74999, "4K UHD", "Vision Electronics", "Sony"));
//        televisionInfoEntities.add(new TelevisionInfoEntity(2, "Samsung Crystal UHD", 55999, "4K UHD", "ElectroWorld", "Samsung"));
//        televisionInfoEntities.add(new TelevisionInfoEntity(3, "LG OLED CX", 102999, "OLED", "HomeZone", "LG"));
//        televisionInfoEntities.add( new TelevisionInfoEntity(4, "Panasonic Viera", 44999, "Full HD", "City Electronics", "Panasonic"));
//        televisionInfoEntities.add( new TelevisionInfoEntity(5, "TCL QLED C715", 62999, "QLED", "BrightTech", "TCL"));
//        televisionInfoEntities.add(  new TelevisionInfoEntity(6, "OnePlus TV Y1S", 27999, "HD Ready", "TechnoWorld", "OnePlus"));
//        televisionInfoEntities.add( new TelevisionInfoEntity(7, "Mi TV 5X", 39999, "4K UHD", "Digital Point", "Xiaomi"));
//        televisionInfoEntities.add(new TelevisionInfoEntity(8, "Realme Smart TV 4K", 37999, "4K UHD", "ElectroMax", "Realme"));
//        televisionInfoEntities.add(new TelevisionInfoEntity(9, "Vu Premium TV", 32999, "Full HD", "TV Plaza", "Vu"));
//        televisionInfoEntities.add( new TelevisionInfoEntity(10, "Hisense A6H", 41999, "4K UHD", "Electra Shoppe", "Hisense"));
//
//        for(TelevisionInfoEntity televisionInfoEntity:televisionInfoEntities) {
//            entityManager.persist(televisionInfoEntity);
//        }
        transaction.commit();

       TelevisionInfoEntity televisionInfoEntity= entityManager.find(TelevisionInfoEntity.class,1);

        System.out.println(televisionInfoEntity);


    }
}
