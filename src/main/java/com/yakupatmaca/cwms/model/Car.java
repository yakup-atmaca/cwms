package com.yakupatmaca.cwms.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="license_plate")
    private String licensePlate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="customer_id", referencedColumnName = "id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="category_id", referencedColumnName = "id")
    private Category category;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="color_id", referencedColumnName = "id")
    private Color color;

    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private Status status;

    @Column(name="explanation", length = 2000)
    private String explanation;
}
