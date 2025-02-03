package com.amirfeiz.spring_security.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "T_USER")
public class User {

    @Id
    private String id;
    private String username;
    private String password;
}
