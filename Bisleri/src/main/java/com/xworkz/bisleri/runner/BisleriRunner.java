package com.xworkz.bisleri.runner;

import com.xworkz.bisleri.entity.BisleriEntity;
import com.xworkz.bisleri.service.BisleriService;
import com.xworkz.bisleri.service.BisleriServiceImpl;

public class BisleriRunner {
    public static void main(String[] args) {

        System.out.println("Runner..");
//1.save
//        BisleriEntity bisleri2=new BisleriEntity(3,5,10,"Davangere");
//
//        BisleriService bisleriService=new BisleriServiceImpl();
//        bisleriService.save(bisleri2);
//2.read
        BisleriService bisleriService=new BisleriServiceImpl();
        BisleriEntity bisleri=bisleriService.getBisleriEntityById(2);

        System.out.println(bisleri);
        //3.update

        boolean result=bisleriService.updateBisleriEntityById(1,"Udupi");
        if(result){
            System.out.println("Sucessfully Updated ....");
        }else System.err.println("Failed to update" );

        //4.remove

        bisleriService.deleteById(2);

    }
}
