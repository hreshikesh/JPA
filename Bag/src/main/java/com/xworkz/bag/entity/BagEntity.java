package com.xworkz.bag.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "bag_info")
@Setter
@Getter
@NoArgsConstructor

public class BagEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "bag_name")
    private String bagName;
    @Column(name="bag_brand")
    private String bagBrand;
    @Column(name="bag_price")
    private int price;

    public BagEntity(String bagName, String bagBrand, int price) {
        this.bagName = bagName;
        this.bagBrand = bagBrand;
        this.price = price;
    }
}
