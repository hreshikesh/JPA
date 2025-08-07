package com.xworkz.soilder.runner;

import com.xworkz.soilder.entity.SoldierEntity;
import com.xworkz.soilder.service.SoldierService;
import com.xworkz.soilder.service.SoldierServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class SoldierRunner {
    public static void main(String[] args) {
        SoldierService soilderService=new SoldierServiceImpl();

//        List<SoldierEntity> soldierList = new ArrayList<>();
//
//        soldierList.add(new SoldierEntity("Amit", 27, "Delhi", "amit123@gmail.com", 9876543210L));
//        soldierList.add(new SoldierEntity("Ravi", 31, "Mumbai", "ravi_soldier@gmail.com", 9812345670L));
//        soldierList.add(new SoldierEntity("Kiran", 25, "Bangalore", "kiran.k@gmail.com", 9988776655L));
//        soldierList.add(new SoldierEntity("Suraj", 29, "Pune", "suraj99@gmail.com", 9765432109L));
//        soldierList.add(new SoldierEntity("Vikas", 33, "Hyderabad", "vikas_bir@gmail.com", 9123456789L));
//        soldierList.add(new SoldierEntity("Rohan", 26, "Chennai", "rohan.sol@gmail.com", 9345678921L));
//        soldierList.add(new SoldierEntity("Anil", 35, "Kolkata", "anil.kh@gmail.com", 9012345678L));
//        soldierList.add(new SoldierEntity("Manoj", 30, "Lucknow", "manoj.chaudhary@gmail.com", 9834567890L));
//        soldierList.add(new SoldierEntity("Arjun", 28, "Patna", "arjun.pat@gmail.com", 9876543021L));
//        soldierList.add(new SoldierEntity("Nikhil", 24, "Nagpur", "nikhil12@gmail.com", 9867543210L));
//        soldierList.add(new SoldierEntity("Rahul", 27, "Bhopal", "rahul_verma@gmail.com", 9321456789L));
//        soldierList.add(new SoldierEntity("Suresh", 32, "Jaipur", "suresh.rathod@gmail.com", 9888123456L));
//        soldierList.add(new SoldierEntity("Prakash", 36, "Ahmedabad", "prakash_singh@gmail.com", 9901234567L));
//        soldierList.add(new SoldierEntity("Vijay", 29, "Indore", "vijay34@gmail.com", 9845612370L));
//        soldierList.add(new SoldierEntity("Ajay", 33, "Coimbatore", "ajay.nair@gmail.com", 9781234567L));
//        soldierList.add(new SoldierEntity("Sanjay", 30, "Nashik", "sanjay.kumar@gmail.com", 9756123498L));
//        soldierList.add(new SoldierEntity("Deepak", 28, "Raipur", "deepak.rana@gmail.com", 9870012345L));
//        soldierList.add(new SoldierEntity("Harish", 34, "Guwahati", "harish.bora@gmail.com", 9845098765L));
//        soldierList.add(new SoldierEntity("Kamal", 31, "Amritsar", "kamal.dev@gmail.com", 9823456123L));
//        soldierList.add(new SoldierEntity("Rakesh", 29, "Varanasi", "rakesh.singh@gmail.com", 9898765432L));
//
//
//        SoldierService soilderService=new SoldierServiceImpl();
//        soilderService.save(soldierList);



//        1.getAll()
        System.out.println("Getting all data fro db...");

        List<SoldierEntity> list=soilderService.getAll();
        list.forEach(e-> System.out.println(e));

        //2.getbyname
        System.out.println("All Data by Name");
        List<SoldierEntity> list1=soilderService.getSoldierEntityByName("Amit");
        list1.forEach(n-> System.out.println(n));

        //3.getbynameandph

        System.out.println("All data by name and phone");
        SoldierEntity soldierEntity=soilderService.getSoilderEntityByNameAndPhone("Ajay",9781234567L);
        System.out.println(soldierEntity);

        //4.Age>25
        System.out.println("All data where age>25");
        List<SoldierEntity> list2=soilderService.getSoilderByAge();
        list2.forEach(a-> System.out.println(a));

        //5.Age between 20 and 30
        System.out.println("get data btwn 20 and 30");
        List<SoldierEntity> list3=soilderService.getAgeBetween();
        list3.forEach(b-> System.out.println(b));


        //6.get by email
        System.out.println("Get data by email");



        //7.get by phoneNo
        System.out.println("get data from phoneNo");









    }



}
