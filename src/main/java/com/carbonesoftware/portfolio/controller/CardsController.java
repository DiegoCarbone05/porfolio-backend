package com.carbonesoftware.portfolio.controller;

import com.carbonesoftware.portfolio.entity.Card;
import com.carbonesoftware.portfolio.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/config/cards")
@RestController
public class CardsController {

    @Autowired
    private CardService cardSvc;

    @GetMapping("/")
    public ResponseEntity<?> getAllCards(){
        return ResponseEntity.ok(cardSvc.getAllCards());
    }

    @PostMapping("/")
    public ResponseEntity<?> saveCard(@RequestBody List<Card>  data) {
        return ResponseEntity.ok(cardSvc.saveCard(data));
    }

    @DeleteMapping("/all")
    public void deleteAll() {
        cardSvc.deleteAll();
    }

}
