package com.yakupatmaca.cwms.model;

import javax.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="company_id", referencedColumnName = "id")
    private Company company;

    @Enumerated(EnumType.STRING)
    @Column(name="role")
    private Role role;

    //Not persistent. There is no column on database table.
    @Transient
    private String token;
}