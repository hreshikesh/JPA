package com.xworkz.fish.runner;

import com.xworkz.fish.entity.FishEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class FishRunner {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("fish");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();

        entityTransaction.begin();

        List<FishEntity> fishList = new ArrayList<>();

        fishList.add(new FishEntity(1, "Rohu", 250, "FreshFish Mart", "Mangalore", 12));
        fishList.add(new FishEntity(2, "Katla", 280, "Blue Ocean Fishery", "Karwar", 15));
        fishList.add(new FishEntity(3, "Bangda", 300, "Sea Pearl Fish Stall", "Udupi", 10));
        fishList.add(new FishEntity(4, "Pomfret", 450, "Ocean Catch", "Kochi", 8));
        fishList.add(new FishEntity(5, "Sardine", 180, "Coastal Fish Store", "Kannur", 9));
        fishList.add(new FishEntity(6, "Mackerel", 320, "Harbor Fresh", "Kasargod", 11));
        fishList.add(new FishEntity(7, "Tilapia", 220, "Aqua Market", "Bangalore", 13));
        fishList.add(new FishEntity(8, "King Fish", 600, "Marina Fish World", "Mangalore", 16));
        fishList.add(new FishEntity(9, "Anchovy", 150, "Fisherman’s Net", "Udupi", 7));
        fishList.add(new FishEntity(10, "Seer Fish", 700, "Deep Sea Hub", "Bangalore", 14));

        for(FishEntity fish:fishList){
            entityManager.persist(fish);
        }

        entityTransaction.commit();



    }
}
