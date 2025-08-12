package com.xworkz.driver.configuaration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DriverInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    public DriverInitializer(){
        System.out.println("no args const of DriverInitializer..");
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{DriverConfiguaration.class};
    }
}
