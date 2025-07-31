package com.xworkz.transport.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "metro_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MetroEntity {

    @Id
    private int id;

    @Column(name = "metro_source")
    private String metroSource;

    @Column(name = "metro_destination")
    private String metroDestination;

    @Column(name = "min_charge")
    private String minCharge;

    @Column(name = "city")
    private String city;

    @Column(name = "driver_name")
    private String driverName;
}
