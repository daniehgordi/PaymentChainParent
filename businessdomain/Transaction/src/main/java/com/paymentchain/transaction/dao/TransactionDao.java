package com.paymentchain.transaction.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentchain.transaction.model.Transaction;

public interface TransactionDao extends JpaRepository<Transaction, Integer> {



}
