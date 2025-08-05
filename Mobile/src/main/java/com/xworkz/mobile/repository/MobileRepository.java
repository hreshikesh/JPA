package com.xworkz.mobile.repository;

import com.xworkz.mobile.entity.MobileEntity;

public interface MobileRepository {
    MobileEntity save(MobileEntity mobileEntity);

    MobileEntity getMobileEntityById(int id);


    boolean updateMobileEntityById(int id,String model);

    void deleteMobileEntityById(int id);
}
