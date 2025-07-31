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
@Table(name = "employee_info")
public class EmployeeEntity {

    @Id
    private int id;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_branch")
    private String employeeBranch;

    @Column(name = "employee_location")
    private String employeeLocation;

    @Column(name = "employee_company")
    private String employeeCompany;

    @Column(name = "employee_position")
    private String employeePosition;
}
