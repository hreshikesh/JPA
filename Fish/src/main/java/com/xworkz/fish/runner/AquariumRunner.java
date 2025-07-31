package com.xworkz.fish.runner;

import com.xworkz.fish.entity.AquariumEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class AquariumRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("fish");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();

        entityTransaction.begin();

//        List<AquariumEntity> aquariumList = new ArrayList<>();
//
//        aquariumList.add(new AquariumEntity(1, "AquaGlow", "Medium", 5, "Rocks, Light", "Glass"));
//        aquariumList.add(new AquariumEntity(2, "BlueWave", "Large", 10, "Plants, Filter", "Acrylic"));
//        aquariumList.add(new AquariumEntity(3, "CrystalClear", "Small", 3, "Gravel, Bubbler", "Glass"));
//        aquariumList.add(new AquariumEntity(4, "OceanView", "Extra Large", 15, "Heater, Filter", "Glass"));
//        aquariumList.add(new AquariumEntity(5, "FishHaven", "Compact", 2, "LED Light, Rocks", "Plastic"));
//        aquariumList.add(new AquariumEntity(6, "AquaDecor", "Medium", 6, "Plants, Gravel", "Glass"));
//        aquariumList.add(new AquariumEntity(7, "EcoTank", "Large", 8, "Light, Heater", "Acrylic"));
//        aquariumList.add(new AquariumEntity(8, "SeaLife", "Small", 4, "Bubbler, Filter", "Glass"));
//        aquariumList.add(new AquariumEntity(9, "NatureAquarium", "Medium", 7, "Rocks, Light", "Glass"));
//        aquariumList.add(new AquariumEntity(10, "WaveDesign", "Extra Large", 12, "Decorations, Plants", "Acrylic"));
//
//        for(AquariumEntity aquariumEntity:aquariumList){
//            entityManager.persist(aquariumEntity);
//        }
//
//        entityTransaction.commit();


        System.out.println(entityManager.find(AquariumEntity.class,10));



    }
}
