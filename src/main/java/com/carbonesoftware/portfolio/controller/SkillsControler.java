package com.carbonesoftware.portfolio.controller;

import com.carbonesoftware.portfolio.entity.Card;
import com.carbonesoftware.portfolio.entity.Skill;
import com.carbonesoftware.portfolio.services.CardService;
import com.carbonesoftware.portfolio.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/config/skills")
@RestController
public class SkillsControler {

    @Autowired
    private SkillService skillSvc;

    @GetMapping("/")
    public ResponseEntity<?> getAllSkills() {
        return ResponseEntity.ok(skillSvc.allSkills());
    }

    @PostMapping("/")
    public ResponseEntity<?> saveSkill(@RequestBody Skill data) {
        return ResponseEntity.ok(skillSvc.save(data));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSkill(@PathVariable(value="id") Integer id) {
        return ResponseEntity.ok(skillSvc.delete(id));
    }
}
