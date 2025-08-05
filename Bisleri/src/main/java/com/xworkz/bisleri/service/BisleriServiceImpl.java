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

    @Override
    public BisleriEntity getBisleriEntityById(int id) {

        BisleriRepository bisleriRepository=new BisleriRepositoryImpl();
        System.out.println("service ...");
       return bisleriRepository.getBisleriEntityById(id);




    }

    @Override
    public boolean updateBisleriEntityById(int id, String location) {

        System.out.println("service update method");
        BisleriRepository bisleriRepository=new BisleriRepositoryImpl();
       boolean result= bisleriRepository.updateBisleriEntityById(id,location);
        return result;
    }

    @Override
    public void deleteById(int id) {
        System.out.println("delete service...");
        BisleriRepository bisleriRepository=new BisleriRepositoryImpl();
        bisleriRepository.deleteById(id);

    }
}
