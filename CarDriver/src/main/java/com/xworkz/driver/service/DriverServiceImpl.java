package com.xworkz.driver.service;

import com.xworkz.driver.dto.DriverDto;
import com.xworkz.driver.entity.DriverEntity;
import com.xworkz.driver.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;

@Service
public class DriverServiceImpl implements  DriverService{
    @Autowired
    DriverRepository driverRepository;
    DriverEntity driverEntity;

    @Override
    public boolean save(DriverDto driverDto) {

        System.out.println("Service Driver Dto" +driverDto);

        driverEntity.setName(driverEntity.getName());
        driverEntity.setAge(driverDto.getAge());
        driverEntity.setEmail(driverEntity.getEmail());
        driverEntity.setPhone(driverEntity.getPhone());



        driverRepository.save(driverEntity);

        return false;
    }
}
