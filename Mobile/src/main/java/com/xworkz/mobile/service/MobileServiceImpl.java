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

    @Override
    public MobileEntity getMobileEntityById(int id) {

        MobileRepository mobileRepository=new MobileRepositoryImpl();
       return mobileRepository.getMobileEntityById(id);




    }

    @Override
    public boolean updateMobileEntityById(int id, String model) {
        MobileRepository mobileRepository=new MobileRepositoryImpl();

        return  mobileRepository.updateMobileEntityById(id,model);
    }

    @Override
    public void deleteMobileEntityById(int id) {
        MobileRepository mobileRepository=new MobileRepositoryImpl();
        mobileRepository.deleteMobileEntityById(id);

    }
}
