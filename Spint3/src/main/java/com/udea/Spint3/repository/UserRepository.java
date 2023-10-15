package com.udea.Spint3.repository;

import com.udea.Spint3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
}
