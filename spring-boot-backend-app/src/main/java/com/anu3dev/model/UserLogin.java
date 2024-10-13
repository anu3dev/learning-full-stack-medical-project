package com.anu3dev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="user_login")
public class UserLogin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
}