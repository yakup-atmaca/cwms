package com.yakupatmaca.cwms.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name", unique = true)
    private String name;

}
