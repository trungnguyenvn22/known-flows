package com.chunchun21.KF.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chunchun21.KF.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, String> {
    
    boolean findByUsername(String username);
}
