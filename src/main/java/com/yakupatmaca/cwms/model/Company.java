package com.yakupatmaca.cwms.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name", unique = true)
    private String name;

    @Column(name="phone_number", length = 20)
    private String phoneNumber;

    @Column(name="explanation", length = 2000)
    private String explanation;
}
