package com.xworkz.company.Entity;

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
@Table(name = "company_info")
public class CompanyEntity {
    @Id
    private int id;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "company_revenue")
    private int revenue;
    @Column(name = "company_ceo")
    private String companyCeo;
    @Column(name = "no_of_branches")
    private int noOfBranches;
    @Column(name = "headquater_location")
    private String headquaterLocation;

}

