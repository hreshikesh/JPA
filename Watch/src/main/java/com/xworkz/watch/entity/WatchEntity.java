package com.xworkz.watch.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "watch_table")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class WatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "watch_name")
    private String watchName;
    @Column(name="watch_brand")
    private String watchBrand;

    private int price;

    public WatchEntity(String watchName, String watchBrand, int price) {
        this.watchName = watchName;
        this.watchBrand = watchBrand;
        this.price = price;
    }
}
