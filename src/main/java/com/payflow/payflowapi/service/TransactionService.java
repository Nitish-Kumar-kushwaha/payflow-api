package com.payflow.payflowapi.service;

import com.payflow.payflowapi.entity.Transaction;
import com.payflow.payflowapi.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction sendMoney(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}