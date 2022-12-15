package com.yakupatmaca.cwms.repository;

import com.yakupatmaca.cwms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
       User findByUsername(String username);
}
