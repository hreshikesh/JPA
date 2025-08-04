package com.xworkz.mobile.service;

import com.xworkz.mobile.entity.MobileEntity;
import com.xworkz.mobile.repository.MobileRepository;
import com.xworkz.mobile.repository.MobileRepositoryImpl;

public class MobileServiceImpl implements MobileService{
    @Override
    public MobileEntity save(MobileEntity mobile) {

        MobileRepository mobileRepository=new MobileRepositoryImpl();
        mobileRepository.save(mobile);


        return null;
    }
}
