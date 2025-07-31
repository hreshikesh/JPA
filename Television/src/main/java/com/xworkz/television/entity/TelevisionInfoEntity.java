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
@Table(name = "television_info")
public class TelevisionInfoEntity {
    @Id
    private int id;

    @Column(name="televsion_name")
    private String tvName;

    @Column(name="tv_price")
    private int tvPrice;

    @Column(name = "tv_quality")
    private String tvQuality;

    @Column(name = "tv_dealer")
    private String tvDealer;

    @Column(name="tv_brand")
    private String tvBrand;


}
