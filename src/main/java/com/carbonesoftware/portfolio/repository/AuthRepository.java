package com.carbonesoftware.portfolio.repository;

import com.carbonesoftware.portfolio.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthRepository extends JpaRepository<User, String>{

    Optional<User> findByEmail(String email);
}
