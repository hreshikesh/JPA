package com.xworkz.soilder.runner;

import com.xworkz.soilder.service.SoldierService;
import com.xworkz.soilder.service.SoldierServiceImpl;

public class GetNameByPlaceRunner {
    public static void main(String[] args) {
        SoldierService service=new SoldierServiceImpl();
        service.getNameByPlace("Delhi");
    }
}
