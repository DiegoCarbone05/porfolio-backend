package com.carbonesoftware.portfolio.services;

import com.carbonesoftware.portfolio.entity.Skill;

import java.util.List;

public interface SkillService {
    List<Skill> allSkills();
    Skill save(Skill item);
    Skill delete(Integer id);
}
