package com.yakupatmaca.cwms.repository;

import com.yakupatmaca.cwms.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
