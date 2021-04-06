package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Utility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="code")
    private int code;
}
