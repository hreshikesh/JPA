package com.xworkz.bisleri.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bisleri_table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BisleriEntity {
    @Id
    private int id;
    @Column(name = "capacity")
    private int capacity;
    @Column(name = "price")
    private int price;
    @Column(name = "location")
    private String location;
}
