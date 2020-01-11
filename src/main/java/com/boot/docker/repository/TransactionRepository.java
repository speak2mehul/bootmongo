package com.boot.docker.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.boot.docker.model.Transaction;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, Long>{

	//public Transaction getTransactionByID(Long transactionId);
}
