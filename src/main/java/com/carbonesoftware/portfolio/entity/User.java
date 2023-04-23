package com.carbonesoftware.portfolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
}
