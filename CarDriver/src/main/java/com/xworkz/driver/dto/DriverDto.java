package com.xworkz.driver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDto {

    private String name;
    private int age;
    private long phone;
    private String email;
    private String place;
}
