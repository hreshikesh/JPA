package com.xworkz.soilder.runner;

import com.xworkz.soilder.entity.SoldierEntity;
import com.xworkz.soilder.service.SoldierServiceImpl;

import java.util.List;

public class GetDetailsAboveAge {
    public static void main(String[] args) {
        List<SoldierEntity> list=new SoldierServiceImpl().getNameAndPlaceAndEmailByAgeLessThan30();

    }
}
