package com.xworkz.driver.entity;
import lombok.*;


import javax.persistence.*;

@Entity
@Table(name = "driver")
@Data
@AllArgsConstructor
@NoArgsConstructor

@NamedQuery(name = "getAll",query = "select e from DriverEntity e ")
@NamedQuery(name="getById",query = "select e from DriverEntity e where id=:idBy")
@NamedQuery(name = "getEmailWithGmail",query="select e.email from DriverEntity e where e.email like '%@gmail.com' ")
@NamedQuery(name = "getNameAndEmailByPhone",query = "select e.name,e.email from DriverEntity e where phone=:phoneBy")
@NamedQuery(name = "getNameEmailPhoneAgeAbove",query = "select e.name,e.email,e.phone from DriverEntity e where age>30")


public class DriverEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "driver_name")
    private String name;
    @Column(name = "driver_age")
    private int age;
    @Column(name = "driver_phone")
    private long phone;
    @Column(name = "driver_email")
    private String email;
    @Column(name="driver_place")
    private String place;
}
