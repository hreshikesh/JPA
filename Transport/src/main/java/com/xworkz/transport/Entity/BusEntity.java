package com.xworkz.transport.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bus_info")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BusEntity {
    @Id
    private int id;

    @Column(name = "bus_name")
    private String busName;

    @Column(name = "source")
    private String source;

    @Column(name = "destination")
    private String destination;

    @Column(name = "price")
    private int price;

    @Column(name = "time")
    private String time;

}
