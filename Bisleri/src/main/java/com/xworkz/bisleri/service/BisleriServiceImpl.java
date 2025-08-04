package com.xworkz.bisleri.service;

import com.xworkz.bisleri.entity.BisleriEntity;
import com.xworkz.bisleri.repository.BisleriRepository;
import com.xworkz.bisleri.repository.BisleriRepositoryImpl;

public class BisleriServiceImpl implements BisleriService{




    @Override
    public BisleriEntity save(BisleriEntity bisleri) {
        System.out.println("Service .."+bisleri);
        BisleriRepository bisleriRepository=new BisleriRepositoryImpl();
        bisleriRepository.save(bisleri);


        return null;
    }
}
