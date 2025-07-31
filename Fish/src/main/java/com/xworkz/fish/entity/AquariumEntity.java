package com.xworkz.fish.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "aquarium_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AquariumEntity {
    @Id
    private int id;
    @Column(name="brand")
    private String brand;

    @Column(name="size")
    private String size;

    @Column(name = "no_of_fishes")
    private int noOfFishes;

    @Column(name = "accesories")
    private String accesories;

    @Column(name="material")
    private String material;

}
