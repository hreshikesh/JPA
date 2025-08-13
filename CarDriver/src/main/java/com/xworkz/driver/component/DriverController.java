package com.xworkz.driver.component;

import com.xworkz.driver.dto.DriverDto;
import com.xworkz.driver.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DriverController {
    @Autowired
    DriverService service;

    public DriverController(){
        System.out.println("DrivetrController ...");
    }

    @RequestMapping("/driver")
    public String getDriver(DriverDto driverDto){
        System.out.println("Runnig driver controller");

        System.out.println(driverDto);

        service.save(driverDto);

        return "DriverForm";
    }
}
