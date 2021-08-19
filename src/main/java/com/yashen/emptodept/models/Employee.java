package com.yashen.emptodept.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "EMPLOYEES")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "FULL_NAME",nullable = false)
    private String name;
    @Column(name = "Position",nullable = false)
    private String position;
    @Column(name = "DATE_OF_EMPLOYMENT",nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "DEPT_ID",referencedColumnName = "id")
    private Department departmentId;

}
