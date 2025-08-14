package com.xworkz.driver.component;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.driver.dto.DriverDto;
import com.xworkz.driver.entity.DriverEntity;
import com.xworkz.driver.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static com.sun.deploy.config.JREInfo.getAll;

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

    @RequestMapping("getAll")
    public ModelAndView getAllData(ModelAndView modelAndView){
       List<DriverEntity> list= service.getAll();


        System.out.println(list);


        modelAndView.addObject("entity",list);

        modelAndView.setViewName("GetAll");

        return modelAndView;
    }

    @RequestMapping("getById")
    public ModelAndView getById(int id,ModelAndView modelAndView){
        DriverEntity driverEntity=service.getById(id);
        System.out.println(driverEntity);
        modelAndView.addObject("entity",driverEntity);
        modelAndView.setViewName("GetById");
        return modelAndView;
    }

    @RequestMapping("updateById")
    public ModelAndView updateById(int id,String name,ModelAndView modelAndView){
      String result=  service.updateById(id,name);
      modelAndView.addObject("result",result);

        modelAndView.setViewName("UpdateById");
        return  modelAndView;
    }

    @RequestMapping("deleteById")
    public ModelAndView deleteById(int id,ModelAndView modelAndView){
           boolean status= service.deleteById(id);

           modelAndView.addObject("status",status);

        modelAndView.setViewName("DeleteById");
        return modelAndView;
    }

    @RequestMapping("getEmailWithPattern")
    public ModelAndView getEmailWithPattern(ModelAndView modelAndView){

       List<String> emails= service.getEmailWithPattern();

       modelAndView.addObject("email",emails);

        modelAndView.setViewName("GetEmailOfPattern");

        return modelAndView;
    }


    @RequestMapping("fetchByPhone")
    public ModelAndView getNameAndEmailByPhone(long phone,ModelAndView modelAndView){

       DriverEntity driverEntity= service.getNameAndEmailByPhone(phone);
        modelAndView.addObject("entity",driverEntity);
        modelAndView.setViewName("GetDetailsByPhone");

        return  modelAndView;
    }


    @RequestMapping("getDetailsByAgeGreater")
    public ModelAndView getDetailsByAgeGreater(ModelAndView modelAndView){

        List<DriverEntity> driverEntities=service.getDetailsByAgeGreater();
        modelAndView.addObject("entity",driverEntities);

        modelAndView.setViewName("GetDetailsByAgeGreater");

        return modelAndView;
    }
}
