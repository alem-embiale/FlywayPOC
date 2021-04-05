package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Utility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private long code;
}
