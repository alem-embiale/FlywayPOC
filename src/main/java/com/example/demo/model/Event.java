package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="utility_event_signal")
    private int utility_event_signal;

    @OneToOne(targetEntity = Utility.class)
    @JoinColumn(name="utility_id", referencedColumnName = "id", updatable = false)
    private Utility utility;

}
