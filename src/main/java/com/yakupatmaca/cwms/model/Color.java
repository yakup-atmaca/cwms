package com.yakupatmaca.cwms.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="color")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name", unique = true)
    private String name;
}
