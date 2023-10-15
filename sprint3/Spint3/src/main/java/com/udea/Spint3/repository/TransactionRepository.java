package com.udea.Spint3.repository;

import com.udea.Spint3.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    List<Transaction>findByUserId(Integer userId);
}


