package com.xworkz.driver.repository;

import com.xworkz.driver.entity.DriverEntity;
import org.springframework.stereotype.Repository;

@Repository
public class DriverRepositoryImpl implements DriverRepository{
    @Override
    public boolean save(DriverEntity driverEntity) {
        System.out.println("Repo..."+driverEntity);
        return false;
    }
}
