package com.xworkz.bag.service;

import com.xworkz.bag.entity.BagEntity;
import com.xworkz.bag.repository.BagRepository;
import com.xworkz.bag.repository.BagRepositoryImpl;

public class BagServiceImpl implements BagService{
    @Override
    public boolean save(BagEntity bag) {
        BagRepository bagRepository=new BagRepositoryImpl();
        bagRepository.save(bag);

        return false;
    }
}
