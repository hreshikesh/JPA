package com.xworkz.driver.entity;
import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "driver_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
