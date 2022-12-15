package com.yakupatmaca.cwms.model;

import javax.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="car_id", referencedColumnName = "id")
    private Car car;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="transaction_type_id", referencedColumnName = "id")
    private TransactionType transactionType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private User user;

    @Column(name="transaction_date")
    private LocalDateTime transactionDate;
}
