package com.yakupatmaca.cwms.repository;

import com.yakupatmaca.cwms.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
