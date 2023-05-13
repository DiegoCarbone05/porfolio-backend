package com.carbonesoftware.portfolio.services;

import com.carbonesoftware.portfolio.entity.Card;

import java.util.List;

public interface CardService {
    List<Card> getAllCards();
    Card saveCard(Card data);
    List<Card> saveCard(List<Card> data);
    void deleteAll();
}
