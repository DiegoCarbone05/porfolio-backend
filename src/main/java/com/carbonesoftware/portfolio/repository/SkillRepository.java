package com.carbonesoftware.portfolio.repository;

import com.carbonesoftware.portfolio.entity.Configuration;
import com.carbonesoftware.portfolio.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {
}
