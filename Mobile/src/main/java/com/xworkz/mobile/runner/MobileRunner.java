package com.xworkz.mobile.runner;

import com.xworkz.mobile.entity.MobileEntity;
import com.xworkz.mobile.service.MobileService;
import com.xworkz.mobile.service.MobileServiceImpl;

public class MobileRunner {
    public static void main(String[] args) {

        MobileEntity mobile=new MobileEntity(1,"Apple",45000,"14Plus");

        MobileEntity mobile1=new MobileEntity(2,"Oppo",15000,"reno2f");

        System.out.println("Runner "+mobile1);
        MobileService mobileService=new MobileServiceImpl();
        mobileService.save(mobile1);

    }
}
