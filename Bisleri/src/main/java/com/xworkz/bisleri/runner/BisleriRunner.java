package com.xworkz.bisleri.runner;

import com.xworkz.bisleri.entity.BisleriEntity;
import com.xworkz.bisleri.service.BisleriService;
import com.xworkz.bisleri.service.BisleriServiceImpl;

public class BisleriRunner {
    public static void main(String[] args) {

        System.out.println("Runner..");

        BisleriEntity bisleri1=new BisleriEntity(2,10,80,"Mangalore");

        BisleriService bisleriService=new BisleriServiceImpl();
        bisleriService.save(bisleri1);

    }
}
