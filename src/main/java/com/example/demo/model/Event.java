package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long utility_event_signal;
    private long ;
}
