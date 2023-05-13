package com.carbonesoftware.portfolio.services.impl;

import com.carbonesoftware.portfolio.entity.Card;
import com.carbonesoftware.portfolio.repository.CardRepository;
import com.carbonesoftware.portfolio.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepo;

    @Override
    public List<Card> getAllCards() {
        return cardRepo.findAll();
    }

    @Override
    public Card saveCard(Card data) {
        return cardRepo.save(data);
    }

    @Override
    public List<Card> saveCard(List<Card> data) {
        return cardRepo.saveAll(data);
    }

    @Override
    public void deleteAll() {
        this.cardRepo.deleteAll();
    }
}
