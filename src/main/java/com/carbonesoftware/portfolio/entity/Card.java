package com.carbonesoftware.portfolio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "picture", length = 32000)
    private String picture;
    @Column(name = "title", length = 100)
    private String title;
    @Column(name = "description", length = 300)
    private String desc;
    @Column(name = "url", length = 256)
    private String url;
}
