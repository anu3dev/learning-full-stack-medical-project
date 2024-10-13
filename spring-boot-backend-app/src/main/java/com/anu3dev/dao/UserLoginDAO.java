package com.anu3dev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anu3dev.model.UserLogin;

@Repository
public interface UserLoginDAO extends JpaRepository<UserLogin, Integer> {
    UserLogin findByUsername(String username);
}