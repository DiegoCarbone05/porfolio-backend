package com.carbonesoftware.portfolio.repository;

import com.carbonesoftware.portfolio.entity.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigurationRepository extends JpaRepository<Configuration, String> {

}
