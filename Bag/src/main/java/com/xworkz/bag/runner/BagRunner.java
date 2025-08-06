package com.xworkz.bag.runner;

import com.xworkz.bag.entity.BagEntity;
import com.xworkz.bag.service.BagService;
import com.xworkz.bag.service.BagServiceImpl;

public class BagRunner {
    public static void main(String[] args) {
        BagEntity bag=new BagEntity("Zenjo","SkyBag",1000);
        BagEntity bag1=new BagEntity("hunter350","ArticHunter",1600);
        BagEntity bag2=new BagEntity("Aura","Skybag",200);
        BagEntity bag3=new BagEntity("EngLishBag","WildCraft",1300);
        BagEntity bag4=new BagEntity("Flipcard","Foxic",1500);
        BagEntity bag5=new BagEntity("OfficeBag","Bata",2000);
        BagEntity bag6=new BagEntity("AS-4","Amerixan Touristor",1800);
        BagEntity bag7=new BagEntity("Global","Globulus",600);
        BagEntity bag8=new BagEntity("SchoolBag","ScoobyDoo",500);
        BagEntity bag9=new BagEntity("Purse","Gucci",8000);


        BagService bagService=new BagServiceImpl();
        bagService.save(bag);
        bagService.save(bag1);
        bagService.save(bag2);
        bagService.save(bag3);
        bagService.save(bag4);
        bagService.save(bag5);
        bagService.save(bag6);
        bagService.save(bag7);
        bagService.save(bag8);
        bagService.save(bag9);

    }
}
