package com.xworkz.fish.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "fish_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FishEntity {
    @Id
    private int id;

    @Column(name = "fish_name")
    private String fishName;

    @Column(name = "fish_price")
    private int fishPrice;

    @Column(name = "fish_shop")
    private String fishShop;

    @Column(name = "shop_location")
    private String shopLocation;

    @Column(name = "size")
    private int size;
}
