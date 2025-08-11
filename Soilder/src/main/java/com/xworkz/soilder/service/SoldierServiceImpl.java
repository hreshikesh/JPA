package com.xworkz.soilder.service;

import com.xworkz.soilder.entity.SoldierEntity;
import com.xworkz.soilder.repository.SoldierRepository;
import com.xworkz.soilder.repository.SoldierRepositoryImpl;

import java.util.Collections;
import java.util.List;

public class SoldierServiceImpl implements SoldierService {
    @Override
    public void save(List<SoldierEntity> list) {
        SoldierRepository soilderRepository=new SoldierRepositoryImpl();
        soilderRepository.save(list);
    }

    @Override
    public List<SoldierEntity> getAll() {
        return new SoldierRepositoryImpl().getAll();
    }

    @Override
    public List<SoldierEntity> getSoldierEntityByName(String name) {
        return new SoldierRepositoryImpl().getSoldierEntityByName(name);
    }

    @Override
    public SoldierEntity getSoilderEntityByNameAndPhone(String name, long phone) {
        return new SoldierRepositoryImpl().getSoilderEntityByNameAndPhone(name,phone);
    }

    @Override
    public List<SoldierEntity> getSoilderByAge() {
        return new SoldierRepositoryImpl().getSoilderByAge();
    }

    @Override
    public List<SoldierEntity> getAgeBetween() {
        return new SoldierRepositoryImpl().getAgeBetween();
    }

    @Override
    public SoldierEntity getByEmail(String email) {
        return new SoldierRepositoryImpl().getByEmail(email);
    }

    @Override
    public SoldierEntity getByPhone(long phone) {
        return new SoldierRepositoryImpl().getByPhone(phone);
    }

    @Override
    public String getNameByPlace(String place) {
        return new SoldierRepositoryImpl().getNameByPlace(place);
    }

    @Override
    public SoldierEntity getNameAndAgeByPhoneNo(long phoneNo) {
        return new SoldierRepositoryImpl().getNameAndAgeByPhoneNo(phoneNo);
    }
}
