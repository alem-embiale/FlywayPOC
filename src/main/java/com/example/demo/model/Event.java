package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    private long utility_event_signal;

    @OneToOne(targetEntity = Utility.class)
    @JoinColumn(name = "utility_code", referencedColumnName = "code", updatable = false)
    private Utility utility;

}
