package com.xworkz.television.runner;

import com.xworkz.television.entity.TelevisionBrandEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class TelevisionBarndRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Television");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();

//
//        List<TelevisionBrandEntity> brandList = new ArrayList<>();
//
//        brandList.add(new TelevisionBrandEntity(1, "Sony", "1946", "Tokyo, Japan", 95000, "Kenichiro Yoshida"));
//        brandList.add(new TelevisionBrandEntity(2, "Samsung", "1938", "Suwon, South Korea", 125000, "Jay Y. Lee"));
//        brandList.add(new TelevisionBrandEntity(3, "LG", "1958", "Seoul, South Korea", 87000, "Koo Kwang-mo"));
//        brandList.add(new TelevisionBrandEntity(4, "Panasonic", "1918", "Osaka, Japan", 69000, "Yuki Kusumi"));
//        brandList.add(new TelevisionBrandEntity(5, "TCL", "1981", "Huizhou, China", 46000, "Li Dongsheng"));
//        brandList.add(new TelevisionBrandEntity(6, "OnePlus", "2013", "Shenzhen, China", 33000, "Pete Lau"));
//        brandList.add(new TelevisionBrandEntity(7, "Xiaomi", "2010", "Beijing, China", 78000, "Lei Jun"));
//        brandList.add(new TelevisionBrandEntity(8, "Realme", "2018", "Shenzhen, China", 25000, "Sky Li"));
//        brandList.add(new TelevisionBrandEntity(9, "Vu", "2006", "Mumbai, India", 15000, "Devita Saraf"));
//        brandList.add(new TelevisionBrandEntity(10, "Hisense", "1969", "Qingdao, China", 40000, "Zhou Houjian"));
//
//        for(TelevisionBrandEntity televisionBrandEntity:brandList) {
//            entityManager.persist(televisionBrandEntity);
//        }
//        entityTransaction.commit();


        TelevisionBrandEntity televisionBrandEntity=entityManager.find(TelevisionBrandEntity.class,2);
        System.out.println(televisionBrandEntity);





    }
}
