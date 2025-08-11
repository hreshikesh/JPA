package com.xworkz.soilder.runner;

import com.xworkz.soilder.entity.SoldierEntity;
import com.xworkz.soilder.repository.SoldierRepositoryImpl;

import java.util.List;

public class GetNameByAge {
    public static void main(String[] args) {
        List<String> list=new SoldierRepositoryImpl().getNameByAge();


    }
}
