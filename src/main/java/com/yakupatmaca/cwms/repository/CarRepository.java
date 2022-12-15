package com.yakupatmaca.cwms.repository;

import com.yakupatmaca.cwms.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
