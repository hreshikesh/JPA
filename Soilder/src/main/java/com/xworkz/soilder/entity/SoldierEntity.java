package com.xworkz.soilder.entity;

import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "solder_table")
//in query lhs is the varname below an drhs is the name given which passed in repo setparametr
@NamedQuery(name = "getAll",query = "select entity from SoldierEntity entity")
@NamedQuery(name = "getEntityByName",query = "select entity from SoldierEntity entity where name=: name")
@NamedQuery(name = "getEntityByNameAndPhone",query = "select entity from SoldierEntity entity where name=:name and phoneNo=:phone")
@NamedQuery(name = "getAgeAbove25",query = "select entity from SoldierEntity entity where age>25")
@NamedQuery(name = "getAgeBetween20And30",query = "select entity from SoldierEntity entity where age between 20 and 30")

public class SoldierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "soilder_name")
    private String name;
    @Column(name="soilder_age")
    private int age;
    @Column(name = "place")
    private String place;
    @Column(name = "email")
    private String email;
    @Column(name = "phoneno")
    private long phoneNo;

    public SoldierEntity(String name, int age, String place, String email, long phoneNo) {
        this.name = name;
        this.age = age;
        this.place = place;
        this.email = email;
        this.phoneNo = phoneNo;
    }
}
