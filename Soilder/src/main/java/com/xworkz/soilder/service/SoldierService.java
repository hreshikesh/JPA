package com.xworkz.soilder.service;

import com.xworkz.soilder.entity.SoldierEntity;

import java.util.List;

public interface SoldierService {
    void save(List<SoldierEntity> list);

    List<SoldierEntity> getAll();

    List<SoldierEntity> getSoldierEntityByName(String name);

    SoldierEntity getSoilderEntityByNameAndPhone(String name,long phone);

    List<SoldierEntity> getSoilderByAge();

    List<SoldierEntity> getAgeBetween();

    SoldierEntity getByEmail(String email);
    SoldierEntity getByPhone(long phone);

    String getNameByPlace(String place);

    SoldierEntity getNameAndAgeByPhoneNo(long phoneNo);

}
