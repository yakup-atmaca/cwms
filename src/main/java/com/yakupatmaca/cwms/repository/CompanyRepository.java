package com.yakupatmaca.cwms.repository;

import com.yakupatmaca.cwms.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
