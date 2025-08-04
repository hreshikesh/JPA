package com.xworkz.mobile.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobile_info")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class MobileEntity {

    @Id
    private int id;
    @Column(name = "mobile_brand")
    private String brand;
    @Column(name = "mobile_price")
    private int price;
    @Column(name = "mobile_model")
    private String model;


}
