package com.carbonesoftware.portfolio.services.impl;

import com.carbonesoftware.portfolio.entity.Skill;
import com.carbonesoftware.portfolio.repository.SkillRepository;
import com.carbonesoftware.portfolio.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    private SkillRepository skillRepo;

    @Override
    public List<Skill> allSkills() {
        return skillRepo.findAll();
    }
    @Override
    public Skill save(Skill item) {
        return skillRepo.save(item);
    }

    @Override
    public Skill delete(Integer id) {
        skillRepo.deleteById(id);
        return null;
    }
}
