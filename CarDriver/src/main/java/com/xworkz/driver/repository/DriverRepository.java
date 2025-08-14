package com.xworkz.driver.repository;

import com.xworkz.driver.entity.DriverEntity;

import java.util.List;

public interface DriverRepository {
    boolean save(DriverEntity driverEntity);

    List<DriverEntity> getAll();

    DriverEntity getById(int id);
    boolean updateById(int id,String name);
    boolean deleteById(int id);
    List<String> getEmailWithPattern();
    DriverEntity getNameAndEmailByPhone(long phone);
    List<DriverEntity> getDetailsByAgeGreater();

}
