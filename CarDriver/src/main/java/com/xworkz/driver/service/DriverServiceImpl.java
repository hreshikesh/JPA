package com.xworkz.driver.service;

import com.xworkz.driver.dto.DriverDto;
import com.xworkz.driver.entity.DriverEntity;
import com.xworkz.driver.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


@Service
public class DriverServiceImpl implements  DriverService{
    @Autowired
    DriverRepository driverRepository;



    @Override
    public boolean save(DriverDto driverDto) {
        System.out.println("Service Driver Dto" +driverDto);
        DriverEntity driverEntity=new DriverEntity();

        driverEntity.setName(driverDto.getName());
        driverEntity.setAge(driverDto.getAge());
        driverEntity.setEmail(driverDto.getEmail());
        driverEntity.setPhone(driverDto.getPhone());
        driverEntity.setPlace(driverDto.getPlace());
        driverRepository.save(driverEntity);

        return false;
    }

    @Override
    public List<DriverEntity> getAll() {
        return driverRepository.getAll();
    }

    @Override
    public DriverEntity getById(int id) {
        return driverRepository.getById(id);
    }

    @Override
    public String updateById(int id, String name) {
        boolean b=driverRepository.updateById(id, name);
        if(b){
            return "Update Sucess";
        }else return "Fail to Update";
    }

    @Override
    public boolean deleteById(int id) {
        boolean b=driverRepository.deleteById(id);
        if(b){
            return true;
        }else return false;

    }

    @Override
    public List<String> getEmailWithPattern() {


        return driverRepository.getEmailWithPattern();
    }

    @Override
    public DriverEntity getNameAndEmailByPhone(long phone) {
        return driverRepository.getNameAndEmailByPhone(phone);
    }

    @Override
    public List<DriverEntity> getDetailsByAgeGreater() {
        return driverRepository.getDetailsByAgeGreater();
    }
}
