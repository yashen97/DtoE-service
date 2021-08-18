package com.yashen.emptodept.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "DEPARTMENT")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME",nullable = false)
    private String name;
    @Column(name = "DEPT_CODE",nullable = false)
    private String code;
}
