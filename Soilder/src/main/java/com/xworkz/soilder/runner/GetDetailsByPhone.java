package com.xworkz.soilder.runner;

import com.xworkz.soilder.entity.SoldierEntity;
import com.xworkz.soilder.service.SoldierServiceImpl;

public class GetDetailsByPhone {
    public static void main(String[] args) {
       SoldierEntity soldierEntity =new SoldierServiceImpl().getNameAndAgeByPhoneNo(9876543210L);
    }
}
