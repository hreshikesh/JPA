package com.xworkz.driver.service;


import com.xworkz.driver.dto.DriverDto;
import com.xworkz.driver.entity.DriverEntity;

import java.util.List;

public interface DriverService {
    boolean save(DriverDto driverDto);

    List<DriverEntity> getAll();

    DriverEntity getById(int id);

    String updateById(int id,String name);

    boolean deleteById(int id);

    List<String> getEmailWithPattern();

    DriverEntity getNameAndEmailByPhone(long phone);

    List<DriverEntity> getDetailsByAgeGreater();
}
