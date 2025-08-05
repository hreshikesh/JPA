package com.xworkz.mobile.service;

import com.xworkz.mobile.entity.MobileEntity;

public interface MobileService {
    MobileEntity save(MobileEntity mobile);

    MobileEntity getMobileEntityById(int id);

    boolean updateMobileEntityById(int id, String model);

    void deleteMobileEntityById(int id);
}
