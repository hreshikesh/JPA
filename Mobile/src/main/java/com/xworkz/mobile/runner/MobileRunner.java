package com.xworkz.mobile.runner;

import com.xworkz.mobile.entity.MobileEntity;
import com.xworkz.mobile.service.MobileService;
import com.xworkz.mobile.service.MobileServiceImpl;

public class MobileRunner {
    public static void main(String[] args) {
//save
//        MobileEntity mobile=new MobileEntity(1,"Apple",45000,"14Plus");

//        MobileEntity mobile2=new MobileEntity(3,"Vivo",25000,"V21Pro");
//
////        System.out.println("Runner "+mobile1);
        MobileService mobileService = new MobileServiceImpl();
//        mobileService.save(mobile2);
//find
        MobileEntity mobileEntity = mobileService.getMobileEntityById(2);
        System.out.println(mobileEntity);
        //update

        mobileService.updateMobileEntityById(1, "15promax");


        //delete
    mobileService.deleteMobileEntityById(2);


    }
}
