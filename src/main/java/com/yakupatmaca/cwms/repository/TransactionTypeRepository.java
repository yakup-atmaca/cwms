package com.yakupatmaca.cwms.repository;

import com.yakupatmaca.cwms.model.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionTypeRepository extends JpaRepository<TransactionType, Integer> {
}
