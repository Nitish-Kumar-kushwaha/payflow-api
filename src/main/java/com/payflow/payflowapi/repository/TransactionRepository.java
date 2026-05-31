package com.payflow.payflowapi.repository;

import com.payflow.payflowapi.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository
        extends JpaRepository<Transaction, Long> {
}