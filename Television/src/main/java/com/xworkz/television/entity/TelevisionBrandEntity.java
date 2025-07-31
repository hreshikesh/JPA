package com.xworkz.television.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "television_brand")
public class TelevisionBrandEntity {
    @Id
    private int id;
    @Column(name = "tv_brand")
    private String tvBrand;
    @Column(name = "brand_year")
    private String year;
    @Column(name="brand_location")
    private String brandLocation;
    @Column(name="barnd_value")
    private int brandValue;
    @Column(name="brand_owner")
    private String brandOwner;
}
